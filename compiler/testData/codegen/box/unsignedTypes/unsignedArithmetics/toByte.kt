// WITH_UNSIGNED
// IGNORE_BACKEND: JVM_IR, JS_IR, JS

var UB_00: UByte = 0x00U
var UB_01: UByte = 0x01U
var UB_FF: UByte = 0xFFU

var US_00: UShort = 0x00U
var US_01: UShort = 0x01U
var US_FF: UShort = 0xFFU
var US_xx00: UShort = 0x1200U
var US_xx01: UShort = 0x3401U
var US_xxFF: UShort = 0x56FFU

var UI_00: UInt = 0x00U
var UI_01: UInt = 0x01U
var UI_FF: UInt = 0xFFU
var UI_xx00: UInt = 0x1200U
var UI_xx01: UInt = 0x3401U
var UI_xxFF: UInt = 0x56FFU

var UL_00: ULong = 0x00UL
var UL_01: ULong = 0x01UL
var UL_FF: ULong = 0xFFUL
var UL_xx00: ULong = 0x1200UL
var UL_xx01: ULong = 0x3401UL
var UL_xxFF: ULong = 0x56FFUL

fun box(): String {
    if (UB_00.toByte() != 0.toByte()) throw AssertionError()
    if (UB_01.toByte() != 1.toByte()) throw AssertionError()
    if (UB_FF.toByte() != (-1).toByte()) throw AssertionError()
    
    if (US_00.toByte() != 0.toByte()) throw AssertionError()
    if (US_01.toByte() != 1.toByte()) throw AssertionError()
    if (US_FF.toByte() != (-1).toByte()) throw AssertionError()
    if (US_xx00.toByte() != 0.toByte()) throw AssertionError()
    if (US_xx01.toByte() != 1.toByte()) throw AssertionError()
    if (US_xxFF.toByte() != (-1).toByte()) throw AssertionError()

    if (UI_00.toByte() != 0.toByte()) throw AssertionError()
    if (UI_01.toByte() != 1.toByte()) throw AssertionError()
    if (UI_FF.toByte() != (-1).toByte()) throw AssertionError()
    if (UI_xx00.toByte() != 0.toByte()) throw AssertionError()
    if (UI_xx01.toByte() != 1.toByte()) throw AssertionError()
    if (UI_xxFF.toByte() != (-1).toByte()) throw AssertionError()

    if (UL_00.toByte() != 0.toByte()) throw AssertionError()
    if (UL_01.toByte() != 1.toByte()) throw AssertionError()
    if (UL_FF.toByte() != (-1).toByte()) throw AssertionError()
    if (UL_xx00.toByte() != 0.toByte()) throw AssertionError()
    if (UL_xx01.toByte() != 1.toByte()) throw AssertionError()
    if (UL_xxFF.toByte() != (-1).toByte()) throw AssertionError()
    
    return "OK"
}