/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen.intrinsics

import org.jetbrains.kotlin.codegen.Callable
import org.jetbrains.kotlin.codegen.CallableMethod

class ConversionWithUnsigned(private val fromType: IntegerTypePair, private val toType: IntegerTypePair) : IntrinsicMethod() {
    override fun toCallable(method: CallableMethod): Callable =
        createUnaryIntrinsicCallable(method) { v ->
            v.coerceWithUnsigned(fromType, toType)
        }
}