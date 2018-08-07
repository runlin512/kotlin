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

val UB_0: UByte = 0u
val UB_1: UByte = 1u
val UB_FF: UByte = 0xFFu
val UB_7F: UByte = 0x7Fu
val UB_80: UByte = 0x80u

fun assertEquals(actual: UByte, expected: UByte) {
    if (actual != expected) {
        throw AssertionError("Expected: <$expected>, actual: <$actual>")
    }
}


fun box(): String {
    assertEquals(B_0.toUByte(), UB_0)
    assertEquals(B_1.toUByte(), UB_1)
    assertEquals(B_M1.toUByte(), UB_FF)
    assertEquals(B_MAX.toUByte(), UB_7F)
    assertEquals(B_MIN.toUByte(), UB_80)

    assertEquals(S_0.toUByte(), UB_0)
    assertEquals(S_1.toUByte(), UB_1)
    assertEquals(S_M1.toUByte(), UB_FF)
    assertEquals(S_MAX.toUByte(), UB_FF)
    assertEquals(S_MIN.toUByte(), UB_0)

    assertEquals(I_0.toUByte(), UB_0)
    assertEquals(I_1.toUByte(), UB_1)
    assertEquals(I_M1.toUByte(), UB_FF)
    assertEquals(I_MAX.toUByte(), UB_FF)
    assertEquals(I_MIN.toUByte(), UB_0)

    assertEquals(L_0.toUByte(), UB_0)
    assertEquals(L_1.toUByte(), UB_1)
    assertEquals(L_M1.toUByte(), UB_FF)
    assertEquals(L_MAX.toUByte(), UB_FF)
    assertEquals(L_MIN.toUByte(), UB_0)

    return "OK"
}