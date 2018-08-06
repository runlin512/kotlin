// WITH_UNSIGNED
// IGNORE_BACKEND: JVM_IR, JS_IR, JS

var UB_00: UByte = 0x00U
var UB_01: UByte = 0x01U
var UB_FF: UByte = 0xFFU

var US_00: UShort = 0x00U
var US_01: UShort = 0x01U
var US_FFFF: UShort = 0xFFFFU

var UI_00: UInt = 0x00U
var UI_01: UInt = 0x01U
var UI_FFFF: UInt = 0xFFFFU
var UI_xxxx_0000: UInt = 0x1234_0000U
var UI_xxxx_0001: UInt = 0x1234_0001U
var UI_xxxx_FFFF: UInt = 0x1234_FFFFU

var UL_00: ULong = 0x00UL
var UL_01: ULong = 0x01UL
var UL_FFFF: ULong = 0xFFFFUL
var UL_xxxx_0000: ULong = 0x1234_0000UL
var UL_xxxx_0001: ULong = 0x1234_0001UL
var UL_xxxx_FFFF: ULong = 0x1234_FFFFUL

fun box(): String {
    if (UB_00.toShort() != 0.toShort()) throw AssertionError()
    if (UB_01.toShort() != 1.toShort()) throw AssertionError()
    if (UB_FF.toShort() != 0xFF.toShort()) throw AssertionError()

    if (US_00.toShort() != 0.toShort()) throw AssertionError()
    if (US_01.toShort() != 1.toShort()) throw AssertionError()
    if (US_FFFF.toShort() != 0xFFFF.toShort()) throw AssertionError()

    if (UI_00.toShort() != 0.toShort()) throw AssertionError()
    if (UI_01.toShort() != 1.toShort()) throw AssertionError()
    if (UI_FFFF.toShort() != 0xFFFF.toShort()) throw AssertionError()
    if (UI_xxxx_0000.toShort() != 0.toShort()) throw AssertionError()
    if (UI_xxxx_0001.toShort() != 1.toShort()) throw AssertionError()
    if (UI_xxxx_FFFF.toShort() != 0xFFFF.toShort()) throw AssertionError()

    if (UL_00.toShort() != 0.toShort()) throw AssertionError()
    if (UL_01.toShort() != 1.toShort()) throw AssertionError()
    if (UL_FFFF.toShort() != 0xFFFF.toShort()) throw AssertionError()
    if (UL_xxxx_0000.toShort() != 0.toShort()) throw AssertionError()
    if (UL_xxxx_0001.toShort() != 1.toShort()) throw AssertionError()
    if (UL_xxxx_FFFF.toShort() != 0xFFFF.toShort()) throw AssertionError()

    return "OK"
}