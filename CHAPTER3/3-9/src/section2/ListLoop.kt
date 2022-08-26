package section2

fun main() {
    val fruits=listOf("apple", "banana", "kiwi")

    for(item in fruits){
        println(item)
    }

    for(index in fruits.indices){
        println("fruits[$index] = ${fruits[index]}")
    }
}