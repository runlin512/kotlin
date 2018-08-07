/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen.intrinsics

import org.jetbrains.kotlin.codegen.StackValue
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.org.objectweb.asm.Type
import org.jetbrains.org.objectweb.asm.commons.InstructionAdapter

private val KOTLIN_PACKAGE_FQNAME = FqName("kotlin")

enum class IntegerTypePair(val baseType: Type, val arithmeticType: Type) {
    Byte(Type.BYTE_TYPE, Type.INT_TYPE),
    Short(Type.SHORT_TYPE, Type.INT_TYPE),
    Int(Type.INT_TYPE, Type.INT_TYPE),
    Long(Type.LONG_TYPE, Type.LONG_TYPE);

    val unsignedFqName = FqName("kotlin.U$name")
    val signedFqName = FqName("kotlin.$name")

    val toUnsigned = "toU$name"
    val toSigned = "to$name"
}

private fun IntrinsicsMap.declareIntrinsicMethod(classFqName: FqName, methodName: String, arity: Int, implementation: IntrinsicMethod) {
    registerIntrinsic(classFqName, null, methodName, arity, implementation)
}

private fun InstructionAdapter.putSizeMask(type: IntegerTypePair, bitwiseType: Type) {
    assert(bitwiseType == Type.INT_TYPE || bitwiseType == Type.LONG_TYPE) {
        "I or J expected: $bitwiseType"
    }

    when (type) {
        IntegerTypePair.Byte -> if (bitwiseType == Type.INT_TYPE) iconst(0xFF) else lconst(0xFF)
        IntegerTypePair.Short -> if (bitwiseType == Type.INT_TYPE) iconst(0xFFFF) else lconst(0xFFFF)
        IntegerTypePair.Int -> if (bitwiseType == Type.INT_TYPE) iconst(-1) else lconst(0xFFFF_FFFFL)
        else -> {}
    }
}

internal fun InstructionAdapter.coerceWithUnsigned(fromType: IntegerTypePair, toType: IntegerTypePair) {
    when {
        // Widening conversion
        // E.g.:
        // UByte.toShort() = data.toShort() and 0xFF
        // Byte.toUShort() = UShort(this.toShort() and 0xFF)
        // UByte.toUShort() = data.toUShort()
        //                  == UShort(data.toShort() and 0xFF)
        fromType < toType -> {
            StackValue.coerce(fromType.baseType, toType.baseType, this)
            putSizeMask(fromType, toType.arithmeticType)
            and(toType.arithmeticType)
            StackValue.coerce(toType.arithmeticType, toType.baseType, this)
        }

        // Narrowing conversion
        // E.g.:
        // UInt.toShort() = data.toShort()
        fromType > toType -> {
            StackValue.coerce(fromType.baseType, toType.baseType, this)
        }

        // Identity conversion, do nothing
        else -> {}
    }
}

internal fun IntrinsicsMap.registerIntrinsics() {
    for (thisType in IntegerTypePair.values()) {
        for (otherType in IntegerTypePair.values()) {
            val conversionWithUnsigned = ConversionWithUnsigned(thisType, otherType)
            declareIntrinsicMethod(thisType.unsignedFqName, otherType.toSigned, 0, conversionWithUnsigned)
            declareIntrinsicMethod(thisType.unsignedFqName, otherType.toUnsigned, 0, conversionWithUnsigned)
            registerIntrinsic(KOTLIN_PACKAGE_FQNAME, thisType.signedFqName.toUnsafe(), otherType.toUnsigned, 0, conversionWithUnsigned)
        }
    }
}