package chap02.section3

fun main() {
    val a: Int=128
    var b=a

    println(a===b)

    var c: Int?=a
    var d: Int?=a
    var e: Int?=c

    println(c==d)
    println(c===d)
    println(c===e)
}