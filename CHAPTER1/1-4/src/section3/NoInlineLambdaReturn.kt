package section3

fun main() {
    retFunc()
}

fun retFunc(){
    println("start of retFunc")

    inlineLambda(13, 3) lit@{a, b ->
        val result = a+b

        if(result>10) return@lit

        println("result: $result")
    }

    println("end of retFunc")
}