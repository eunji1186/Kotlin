package section2

class BIrd(var name: String, var wing: Int, var beak: String, var color: String){
    fun fly()=println("Fly wing: $wing")
    fun sing(vol: Int)=println("Sing vol: $vol")
}

fun main() {
    val caca=BIrd("mybird", 2, "short", "blue")

    caca.color="yellow"
    println("caca.color: ${caca.color}")

    caca.fly()
    caca.sing(3)
}