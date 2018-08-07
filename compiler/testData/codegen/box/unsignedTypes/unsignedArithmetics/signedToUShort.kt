// WITH_UNSIGNED
// IGNORE_BACKEND: JVM_IR, JS_IR, JS

var B_0 = 0.toByte()
var B_1 = 1.toByte()
var B_M1 = (-1).toByte()
var B_MAX = Byte.MAX_VALUE
var B_MIN = Byte.MIN_VALUE

var S_0 = 0.toShort()
var S_1 = 1.toShort()
var S_M1 = (-1).toShort()
var S_MAX = Short.MAX_VALUE
var S_MIN = Short.MIN_VALUE

var I_0 = 0
var I_1 = 1
var I_M1 = -1
var I_MAX = Int.MAX_VALUE
var I_MIN = Int.MIN_VALUE

var L_0 = 0L
var L_1 = 1L
var L_M1 = -1L
var L_MAX = Long.MAX_VALUE
var L_MIN = Long.MIN_VALUE

val US_0: UShort = 0u
val US_1: UShort = 1u
val US_FF: UShort = 0xFFu
val US_7F: UShort = 0x7Fu
val US_80: UShort = 0x80u
val US_FFFF: UShort = 0xFFFFu
val US_7FFF: UShort = 0x7FFFu
val US_8000: UShort = 0x8000u

fun assertEquals(actual: UShort, expected: UShort) {
    if (actual != expected) {
        throw AssertionError("Expected: <$expected>, actual: <$actual>")
    }
}


fun box(): String {
    assertEquals(B_0.toUShort(), US_0)
    assertEquals(B_1.toUShort(), US_1)
    assertEquals(B_M1.toUShort(), US_FF)
    assertEquals(B_MAX.toUShort(), US_7F)
    assertEquals(B_MIN.toUShort(), US_80)

    assertEquals(S_0.toUShort(), US_0)
    assertEquals(S_1.toUShort(), US_1)
    assertEquals(S_M1.toUShort(), US_FFFF)
    assertEquals(S_MAX.toUShort(), US_7FFF)
    assertEquals(S_MIN.toUShort(), US_8000)

    assertEquals(I_0.toUShort(), US_0)
    assertEquals(I_1.toUShort(), US_1)
    assertEquals(I_M1.toUShort(), US_FFFF)
    assertEquals(I_MAX.toUShort(), US_FFFF)
    assertEquals(I_MIN.toUShort(), US_0)

    assertEquals(L_0.toUShort(), US_0)
    assertEquals(L_1.toUShort(), US_1)
    assertEquals(L_M1.toUShort(), US_FFFF)
    assertEquals(L_MAX.toUShort(), US_FFFF)
    assertEquals(L_MIN.toUShort(), US_0)

    return "OK"
}