package section2

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun DoWork1(): String{
    delay(1000)

    return "Work1"
}

suspend fun DoWork2(): String{
    delay(3000)

    return "Work2"
}

fun main()= runBlocking {
    val time= measureTimeMillis {
        val One=async(start=CoroutineStart.LAZY) { DoWork1()}
        val Two=async(start=CoroutineStart.LAZY) { DoWork2()}

        println("AWAIT: ${One.await() + "_" + Two.await()}")
    }

    println("Completed in $time ms")
}