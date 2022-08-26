package section4

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.system.measureTimeMillis

val counterContext= newSingleThreadContext("ConterContext")
var t_counter=0

suspend fun t_massiveRun(context: CoroutineContext, t_action: suspend() -> Unit){
    val n=1000
    val k=1000
    val time= measureTimeMillis {
        val jobs=List(n){
            GlobalScope.launch(context){
                repeat(k){
                    t_action()
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
    t_massiveRun(counterContext){
        withContext(counterContext){
            t_counter++
        }
    }

    println("Counter= $t_counter")
}