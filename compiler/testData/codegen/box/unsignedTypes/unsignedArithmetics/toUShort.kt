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

val EXPECTED_0: UShort = 0U
val EXPECTED_1: UShort = 1U
val EXPECTED_FF: UShort = 0xFFU
val EXPECTED_FFFF: UShort = 0xFFFFU

fun box(): String {
    if (UB_00.toUShort() != EXPECTED_0) throw AssertionError()
    if (UB_01.toUShort() != EXPECTED_1) throw AssertionError()
    if (UB_FF.toUShort() != EXPECTED_FF) throw AssertionError()

    if (US_00.toUShort() != EXPECTED_0) throw AssertionError()
    if (US_01.toUShort() != EXPECTED_1) throw AssertionError()
    if (US_FFFF.toUShort() != EXPECTED_FFFF) throw AssertionError()

    if (UI_00.toUShort() != EXPECTED_0) throw AssertionError()
    if (UI_01.toUShort() != EXPECTED_1) throw AssertionError()
    if (UI_FFFF.toUShort() != EXPECTED_FFFF) throw AssertionError()
    if (UI_xxxx_0000.toUShort() != EXPECTED_0) throw AssertionError()
    if (UI_xxxx_0001.toUShort() != EXPECTED_1) throw AssertionError()
    if (UI_xxxx_FFFF.toUShort() != EXPECTED_FFFF) throw AssertionError()

    if (UL_00.toUShort() != EXPECTED_0) throw AssertionError()
    if (UL_01.toUShort() != EXPECTED_1) throw AssertionError()
    if (UL_FFFF.toUShort() != EXPECTED_FFFF) throw AssertionError()
    if (UL_xxxx_0000.toUShort() != EXPECTED_0) throw AssertionError()
    if (UL_xxxx_0001.toUShort() != EXPECTED_1) throw AssertionError()
    if (UL_xxxx_FFFF.toUShort() != EXPECTED_FFFF) throw AssertionError()

    return "OK"
}