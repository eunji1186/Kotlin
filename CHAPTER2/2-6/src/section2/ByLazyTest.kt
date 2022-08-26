package section2

class LazyTest{
    init{
        println("init block")
    }

    val subject by lazy{
        println("lazy initalized")

        "Kotlin Programming"    //lazy 값 반환
    }

    fun flow(){
        println("not initialized")
        println("subject one: $subject")
        println("subject two: $subject")
    }
}

fun main() {
    val test=LazyTest()

    test.flow()
}