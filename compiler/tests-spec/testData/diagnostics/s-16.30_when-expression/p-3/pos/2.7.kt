// !WITH_BASIC_TYPES

/*
 KOTLIN DIAGNOSTIC SPEC TEST (POSITIVE)

 SECTION 16.30: When expression
 PARAGRAPH: 3
 SENTENCE 2: Each entry consists of a boolean condition (or a special else condition), each of which is checked and evaluated in order of appearance.
 NUMBER: 7
 DESCRIPTION: 'When' without bound value and enumeration of the boolean expressions.
 */

// CASE DESCRIPTION: 'When' with enumeration of the boolean expressions (exactly Boolean).
fun case_1(value1: _BasicTypesProvider): String {
    when {
        !!!!!!getBoolean("4") && getBoolean("5"), value1.getBoolean("6")  -> return ""
        value1.getBoolean("6"), getList() === listOf(1, 2, 3) -> return ""
        getList() == arrayListOf(1, 2, 3), getLong("1") == 1000L -> return ""
        ((((false)))), !!!true && true -> return ""
        true && true && true && !!!true && true, getBoolean("5") -> return ""
    }

    return ""
}

/*
 CASE DESCRIPTION: 'When' with enumeration of the Nothing (subtype of the Boolean).
 UNEXPECTED BEHAVIOUR
 ISSUES: KT-25948
 */
fun case_2(value1: _BasicTypesProvider): String = when {
    false || false && true || value1.getNothing() -> return ""
    getNothing(), getList() == arrayListOf(1, 2, 3) -> return ""
    !!!!!!getBoolean("4") && getBoolean("5"), return "" -> return ""
    throw Exception(), return "" -> return ""
    throw Exception(), throw Exception() -> return ""
    return "", return "" -> return ""
    else -> ""
}