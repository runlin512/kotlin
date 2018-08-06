// WITH_UNSIGNED

fun use(a: Any) {}

var ub = 0.toUByte()
var us = 0.toUShort()
var ui = 0.toUInt()
var ul = 0.toULong()

fun test() {
    use(ub.toByte())
    use(ub.toShort())
    use(ub.toInt())
    use(ub.toLong())

    use(us.toByte())
    use(us.toShort())
    use(us.toInt())
    use(us.toLong())

    use(ui.toByte())
    use(ui.toShort())
    use(ui.toInt())
    use(ui.toLong())

    use(ul.toByte())
    use(ul.toShort())
    use(ul.toInt())
    use(ul.toLong())
}

// 0 toByte
// 0 toShort
// 0 toInt
// 0 toLong