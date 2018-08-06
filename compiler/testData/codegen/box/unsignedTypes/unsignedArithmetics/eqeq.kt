// WITH_UNSIGNED
// IGNORE_BACKEND: JVM_IR, JS_IR, JS

var ub0: UByte = 0U
var uba: UByte = 42U
var ubb: UByte = 42U

var us0: UShort = 0U
var usa: UShort = 0x1234U
var usb: UShort = 0x1234U

var ui0: UInt = 0U
var uia: UInt = 0x1234_5678U
var uib: UInt = 0x1234_5678U

var ul0: ULong = 0UL
var ula: ULong = 0x1234_5678UL
var ulb: ULong = 0x1234_5678UL

fun box(): String {
    if (ub0 == uba) throw AssertionError()
    if (!(uba == ubb)) throw AssertionError()
    if (uba != ubb) throw AssertionError()
    if (!(uba != ub0)) throw AssertionError()

    if (us0 == usa) throw AssertionError()
    if (!(usa == usb)) throw AssertionError()
    if (usa != usb) throw AssertionError()
    if (!(usa != us0)) throw AssertionError()

    if (ui0 == uia) throw AssertionError()
    if (!(uia == uib)) throw AssertionError()
    if (uia != uib) throw AssertionError()
    if (!(uia != ui0)) throw AssertionError()
    
    if (ul0 == ula) throw AssertionError()
    if (!(ula == ulb)) throw AssertionError()
    if (ula != ulb) throw AssertionError()
    if (!(ula != ul0)) throw AssertionError()

    return "OK"
}
