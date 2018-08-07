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
var UL_FFFF_FFFF: ULong = 0xFFFF_FFFFUL
var UL_xxxx_xxxx_0000_0000: ULong = 0x1234_5678_0000_0000UL
var UL_xxxx_xxxx_0000_0001: ULong = 0x1234_5678_0000_0001UL
var UL_xxxx_xxxx_FFFF_FFFF: ULong = 0x1234_5678_FFFF_FFFFUL

fun box(): String {
    if (UB_00.toUInt() != 0U) throw AssertionError()
    if (UB_01.toUInt() != 1U) throw AssertionError()
    if (UB_FF.toUInt() != 0xFFU) throw AssertionError()

    if (US_00.toUInt() != 0U) throw AssertionError()
    if (US_01.toUInt() != 1U) throw AssertionError()
    if (US_FFFF.toUInt() != 0xFFFFU) throw AssertionError()

    if (UI_00.toUInt() != 0U) throw AssertionError()
    if (UI_01.toUInt() != 1U) throw AssertionError()
    if (UI_FFFF_FFFF.toUInt() != 0xFFFF_FFFFU) throw AssertionError()

    if (UL_00.toUInt() != 0U) throw AssertionError()
    if (UL_01.toUInt() != 1U) throw AssertionError()
    if (UL_FFFF_FFFF.toUInt() != 0xFFFF_FFFFU) throw AssertionError()
    if (UL_xxxx_xxxx_0000_0000.toUInt() != 0U) throw AssertionError()
    if (UL_xxxx_xxxx_0000_0001.toUInt() != 1U) throw AssertionError()
    if (UL_xxxx_xxxx_FFFF_FFFF.toUInt() != 0xFFFF_FFFFU) throw AssertionError()

    return "OK"
}