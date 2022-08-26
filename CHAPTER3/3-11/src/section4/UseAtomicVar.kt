//원자 변수 사용 후
package section4

import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

var a_counter=AtomicInteger(0)

suspend fun a_massiveRun(a_action: suspend() -> Unit){
    val n=1000
    val k=1000
    val time=measureTimeMillis{
        val jobs=List(n){
            GlobalScope.launch {
                repeat(k){
                    a_action()
                }
            }
        }

        jobs.forEach {
            it.join()
        }
    }

    println("Completed ${n*k} actions in $time ms")
}

fun main() = runBlocking<Unit> {
    massiveRun {
        a_counter.incrementAndGet()
    }

    println("Counter=${a_counter.get()}")
}