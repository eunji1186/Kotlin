package section3

fun main() {
    val intsLinedHashSet: java.util.LinkedHashSet<Int> = linkedSetOf(35, 21, 76, 25, 75)

    intsLinedHashSet.add(4)
    intsLinedHashSet.remove(21)
    println(intsLinedHashSet)

    intsLinedHashSet.clear()
    println(intsLinedHashSet)
}