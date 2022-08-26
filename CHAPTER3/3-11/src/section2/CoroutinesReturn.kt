package section2

import kotlinx.coroutines.*

fun main() {
    val job=GlobalScope.launch{
        delay(1000L)
        println("Wolrd!")
    }

    println("Hello, ")
    println("job.isActive: ${job.isActive}, completed: ${job.isCompleted}")

    Thread.sleep(2000L)
    println("job.isActive: ${job.isActive}, completed: ${job.isCompleted}")
}