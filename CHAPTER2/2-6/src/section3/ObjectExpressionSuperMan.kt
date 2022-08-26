package section3

open class Superman(){
    fun work()=println("Taking photos")
    fun talk()=println("Talking with people.")
    open fun fly()=println("Flying in the air.")
}

fun main() {
    val pretendedman=object: Superman(){
        override fun fly()=println("I'm not a real superman. I can't fly!")
    }

    pretendedman.work()
    pretendedman.talk()
    pretendedman.fly()
}