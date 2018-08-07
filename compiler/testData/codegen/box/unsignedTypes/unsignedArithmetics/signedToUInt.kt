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

fun assertEquals(actual: UInt, expected: UInt) {
    if (actual != expected) {
        throw AssertionError("Expected: <$expected>, actual: <$actual>")
    }
}

fun box(): String {
    assertEquals(B_0.toUInt(), 0u)
    assertEquals(B_1.toUInt(), 1u)
    assertEquals(B_M1.toUInt(), 0xFFu)
    assertEquals(B_MAX.toUInt(), 0x7Fu)
    assertEquals(B_MIN.toUInt(), 0x80u)

    assertEquals(S_0.toUInt(), 0u)
    assertEquals(S_1.toUInt(), 1u)
    assertEquals(S_M1.toUInt(), 0xFFFFu)
    assertEquals(S_MAX.toUInt(), 0x7FFFu)
    assertEquals(S_MIN.toUInt(), 0x8000u)

    assertEquals(I_0.toUInt(), 0u)
    assertEquals(I_1.toUInt(), 1u)
    assertEquals(I_M1.toUInt(), 0xFFFF_FFFFu)
    assertEquals(I_MAX.toUInt(), 0x7FFF_FFFFu)
    assertEquals(I_MIN.toUInt(), 0x8000_0000u)

    assertEquals(L_0.toUInt(), 0u)
    assertEquals(L_1.toUInt(), 1u)
    assertEquals(L_M1.toUInt(), 0xFFFF_FFFFu)
    assertEquals(L_MAX.toUInt(), 0xFFFF_FFFFu)
    assertEquals(L_MIN.toUInt(), 0x0000_0000u)

    return "OK"
}