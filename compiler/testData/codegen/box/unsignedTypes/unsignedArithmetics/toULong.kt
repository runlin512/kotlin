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
var UI_FFFF_FFFF: UInt = 0xFFFF_FFFFU

var UL_00: ULong = 0x00UL
var UL_01: ULong = 0x01UL
var UL_FFFF_FFFF_FFFF_FFFF: ULong = 0xFFFF_FFFF_FFFF_FFFFUL

fun box(): String {
    if (UB_00.toULong() != 0UL) throw AssertionError()
    if (UB_01.toULong() != 1UL) throw AssertionError()
    if (UB_FF.toULong() != 0xFFUL) throw AssertionError()

    if (US_00.toULong() != 0UL) throw AssertionError()
    if (US_01.toULong() != 1UL) throw AssertionError()
    if (US_FFFF.toULong() != 0xFFFFUL) throw AssertionError()

    if (UI_00.toULong() != 0UL) throw AssertionError()
    if (UI_01.toULong() != 1UL) throw AssertionError()
    if (UI_FFFF_FFFF.toULong() != 0xFFFF_FFFFUL) throw AssertionError()

    if (UL_00.toULong() != 0UL) throw AssertionError()
    if (UL_01.toULong() != 1UL) throw AssertionError()
    if (UL_FFFF_FFFF_FFFF_FFFF.toULong() != 0xFFFF_FFFF_FFFF_FFFFUL) throw AssertionError()

    return "OK"
}