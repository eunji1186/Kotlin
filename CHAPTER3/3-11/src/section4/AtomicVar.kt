//원자 변수 사용 전

package section4

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

var counter=0

suspend fun massiveRun(action: suspend() -> Unit){
    val n=1000
    val k=1000
    val time=measureTimeMillis{
        val jobs=List(n){
            GlobalScope.launch {
                repeat(k){
                    action()
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
        counter++
    }

    println("Counter=$counter")
}