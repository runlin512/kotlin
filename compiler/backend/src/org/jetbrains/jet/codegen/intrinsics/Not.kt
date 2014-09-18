/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.codegen.intrinsics

import com.intellij.psi.PsiElement
import org.jetbrains.org.objectweb.asm.Type
import org.jetbrains.org.objectweb.asm.commons.InstructionAdapter
import org.jetbrains.jet.codegen.ExpressionCodegen
import org.jetbrains.jet.codegen.StackValue
import org.jetbrains.jet.lang.psi.JetExpression
import org.jetbrains.jet.codegen.CallableMethod
import org.jetbrains.jet.codegen.ExtendedCallable

public class Not : IntrinsicMethod() {
    override fun generateImpl(codegen: ExpressionCodegen, v: InstructionAdapter, returnType: Type, element: PsiElement?, arguments: List<JetExpression>?, receiver: StackValue?): Type {
        val stackValue: StackValue
        if (arguments!!.size() == 1) {
            stackValue = codegen.gen(arguments.get(0))
        }
        else {
            stackValue = receiver!!
        }
        stackValue.put(Type.BOOLEAN_TYPE, v)
        StackValue.not(StackValue.onStack(Type.BOOLEAN_TYPE)).put(returnType, v)
        return returnType
    }


    override fun supportCallable(): Boolean {
        return true
    }

    override fun toCallable(method: CallableMethod): IntrinsicCallable {
        return MappedCallable(method) {
            StackValue.not(StackValue.onStack(Type.BOOLEAN_TYPE)).put(calcReceiverType(), it)
        }
    }
}
