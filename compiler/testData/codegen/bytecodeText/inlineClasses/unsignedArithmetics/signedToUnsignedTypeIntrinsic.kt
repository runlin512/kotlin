// WITH_UNSIGNED

fun use(a: Any) {}

var sb = 0.toByte()
var ss = 0.toShort()
var si = 0
var sl = 0L

fun test() {
    use(sb.toUByte())
    use(sb.toUShort())
    use(sb.toUInt())
    use(sb.toULong())

    use(ss.toUByte())
    use(ss.toUShort())
    use(ss.toUInt())
    use(ss.toULong())

    use(si.toUByte())
    use(si.toUShort())
    use(si.toUInt())
    use(si.toULong())

    use(sl.toUByte())
    use(sl.toUShort())
    use(sl.toUInt())
    use(sl.toULong())
}

// 0 toUByte
// 0 toUShort
// 0 toUInt
// 0 toULong