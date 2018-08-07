/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen

interface CustomArgumentCoercion {
    fun coerceReceiver(value: StackValue): StackValue
    fun coerceArgument(value: StackValue, index: Int): StackValue

    object Identity : CustomArgumentCoercion {
        override fun coerceReceiver(value: StackValue): StackValue = value
        override fun coerceArgument(value: StackValue, index: Int): StackValue = value
    }
}