// !WITH_BASIC_TYPES

/*
 KOTLIN DIAGNOSTIC SPEC TEST (POSITIVE)

 SECTION 16.30: When expression
 PARAGRAPH: 3
 SENTENCE 2: Each entry consists of a boolean condition (or a special else condition), each of which is checked and evaluated in order of appearance.
 NUMBER: 1
 DESCRIPTION: 'When' without bound value and enumeration of the mixed values (Boolean and not Boolean expressions).
 */

// CASE DESCRIPTION: 'When' with numbers mixed with boolean expressions in 'when condition'.
fun case_1(
    value1: Int,
    value2: Int,
    value3: Short,
    value4: Byte,
    value5: Char,
    value6: Long,
    value7: Float,
    value8: Double,
    value9: _BasicTypesProvider
): String {
    when {
        value1 == 21, -9 + 11 -> return ""
        9 / 11, value2 > -.000000001 && value2 < 0.000000001 -> return ""
        value3 > 2.0 && value3 <= 1000.90, value4 == 0.toShort(), getShort(13) - 143.toShort() -> return ""
        value6 * 432L, 9.inv(), value5 > -128 || value5 < 127 -> return ""
        value6 > 213412341234L && value6 <= 1100000000000L || value6 == 0L, true, false, -0L * 20L -> return ""
        11 == 11 || 13123123123123L == 0L || 0f == 0f && !!!(-.0000000001 == -.0000000001) || ((-10).toByte() == 90.toByte()) || 91.toChar() == 127.toChar(), 9 % 11 + 123 - value1 or 11 and value2 / value9.getDouble(321) - -.1223F -> return ""
        value8 == 127.toChar(), value9.getDouble(321) - 10000.0 -> return ""
    }

    return ""
}

// CASE DESCRIPTION: 'When' with String and Char mixed with boolean expressions in 'when condition'.
fun case_2(value1: String, value2: Char, value3: _BasicTypesProvider): String {
    when {
        value1 == 21, "" -> return ""
        '-', value2 > -.000000001 && value2 < 0.000000001 -> return ""
        value3 > 2.0 && value3 <= 1000.90, value4 == 0.toShort(), "$value1$value2" -> return ""
        value1, value5 > -128 || value5 < 127 -> return ""
        value6 > 213412341234L && value6 <= 1100000000000L || value6 == 0L, true, false, "$value1${getString(43)}" -> return ""
        11 == 11 || 13123123123123L == 0L || 0f == 0f && !!!(-.0000000001 == -.0000000001) || ((-10).toByte() == 90.toByte()) || 91.toChar() == 127.toChar(), "${value3.getString(33)}" -> return ""
        "${value3.getString(33)}", getChar(32), true -> return ""
        value3.getChar(32) - 20, value5 > -128 -> return ""
        false, value1 + "..." + value3.getString(43) -> return ""
    }

    return ""
}

// CASE DESCRIPTION: 'When' with Unit mixed with boolean expressions in 'when condition'.
fun case_3(value1: Unit, value2: _BasicTypesProvider): String {
    when {
        value1 == 21, value1 -> return ""
        value2.getUnit(), value2 > -.000000001 && value2 < 0.000000001 -> return ""
        getUnit(), value5 > -128 || value5 < 127 -> return ""
        {}, value5 > -128 || value5 < 127 -> return ""
        value5 > -128, fun() {} -> return ""
        11 == 11 || 13123123123123L == 0L || 0f == 0f && !!!(-.0000000001 == -.0000000001) || ((-10).toByte() == 90.toByte()) || 91.toChar() == 127.toChar(), fun() {} -> return ""
    }

    return ""
}

// CASE DESCRIPTION: 'When' with Any mixed with boolean expressions in 'when condition'.
fun case_4(value1: Any, value2: _BasicTypesProvider): String {
    when {
        value1 == 21, value1 -> return ""
        true, value2.getAny() -> return ""
        false, getAny() -> return ""
        getAny(), true -> return ""
    }

    return ""
}

// CASE DESCRIPTION: 'When' with List (Collection example) mixed with boolean expressions in 'when condition'.
fun case_5(value1: List<Int>, value2: _BasicTypesProvider): String {
    when {
        value1, value5 < 127 -> return ""
        value2.getList(), value2.getList().isEmpty() -> return ""
        getList().isNotEmpty(), getList() -> return ""
    }

    return ""
}

// CASE DESCRIPTION: 'When' with range expression (IntRange) mixed with boolean expressions in 'when condition'.
fun case_6(value1: Int, value2: Int): String {
    when {
        10 in -10..-1, -10..-1 -> return ""
        -0..0, 0 in -0..0 -> return ""
        value5 < 127, 1..value1 -> return ""
        1..value1, value5 < 127 -> return ""
        false, value1 + 1..value2 -> return ""
        true, value1 + 1..value2 -> return ""
    }

    return ""
}

// CASE DESCRIPTION: 'When' with Nothing mixed with not boolean expressions in 'when condition'.
fun case_7(value1: Nothing): String {
    when {
        value1, -10..-1 -> return ""
        throw Exception() -> return ""
        10, throw Exception() -> return ""
        return -> return ""
        "", return -> return ""
        return, return -> return ""
        '-', getNothing() -> return ""
    }

    return ""
}