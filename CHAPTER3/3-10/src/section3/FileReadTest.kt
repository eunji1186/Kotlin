package section3

import java.io.*

fun main() {
    val path="D:\\teset\\Over the Rainbow.txt"

    try{
        val read=FileReader(path)
        println(read.readText())
    }catch(e: Exception){
        println(e.message)
    }
}