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

fun assertEquals(actual: ULong, expected: ULong) {
    if (actual != expected) {
        throw AssertionError("Expected: <$expected>, actual: <$actual>")
    }
}

fun box(): String {
    assertEquals(B_0.toULong(), 0UL)
    assertEquals(B_1.toULong(), 1UL)
    assertEquals(B_M1.toULong(), 0xFFUL)
    assertEquals(B_MAX.toULong(), 0x7FUL)
    assertEquals(B_MIN.toULong(), 0x80UL)

    assertEquals(S_0.toULong(), 0UL)
    assertEquals(S_1.toULong(), 1UL)
    assertEquals(S_M1.toULong(), 0xFFFFUL)
    assertEquals(S_MAX.toULong(), 0x7FFFUL)
    assertEquals(S_MIN.toULong(), 0x8000UL)

    assertEquals(I_0.toULong(), 0UL)
    assertEquals(I_1.toULong(), 1UL)
    assertEquals(I_M1.toULong(), 0xFFFF_FFFFUL)
    assertEquals(I_MAX.toULong(), 0x7FFF_FFFFUL)
    assertEquals(I_MIN.toULong(), 0x8000_0000UL)

    assertEquals(L_0.toULong(), 0UL)
    assertEquals(L_1.toULong(), 1UL)
    assertEquals(L_M1.toULong(), 0xFFFF_FFFF_FFFF_FFFFUL)
    assertEquals(L_MAX.toULong(), 0x7FFF_FFFF_FFFF_FFFFUL)
    assertEquals(L_MIN.toULong(), 0x8000_0000_0000_0000UL)

    return "OK"
}