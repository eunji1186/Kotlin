package section1

interface Pet{
    var category: String
    fun feeding()
    fun patting(){
        println("Keep patting!")
    }
}

class Cat(override var category: String) : Pet{
    override fun feeding(){
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj=Cat("small")

    println("Pet Category: ${obj.category}")
    obj.feeding()
    obj.patting()
}