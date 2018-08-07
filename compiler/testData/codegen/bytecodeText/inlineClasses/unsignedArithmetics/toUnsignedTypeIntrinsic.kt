// WITH_UNSIGNED

fun use(a: Any) {}

var ub = 0.toUByte()
var us = 0.toUShort()
var ui = 0.toUInt()
var ul = 0.toULong()

fun test() {
    use(ub.toUByte())
    use(ub.toUShort())
    use(ub.toUInt())
    use(ub.toULong())

    use(us.toUByte())
    use(us.toUShort())
    use(us.toUInt())
    use(us.toULong())

    use(ui.toUByte())
    use(ui.toUShort())
    use(ui.toUInt())
    use(ui.toULong())

    use(ul.toUByte())
    use(ul.toUShort())
    use(ul.toUInt())
    use(ul.toULong())
}

// 0 toUByte
// 0 toUShort
// 0 toUInt
// 0 toULong