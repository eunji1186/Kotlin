package section2

fun main() {
    val nonNulllsList: List<Int> = listOfNotNull(2, 45, 2, null, 5, null)

    println(nonNulllsList)
}