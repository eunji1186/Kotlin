package section2

class BIRd(var name: String, var wing: Int, var beak: String, var color: String){
    init{
        println("----------초기화 블록 시작----------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("----------초기화 블록 끝----------")
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int)=println("Sing vol: $vol")
}

fun main() {
    val cece=BIRd("mybird", 2, "short", "blue")

    cece.color="yellow"
    println("cece.color: ${cece.color}")

    cece.fly()
}