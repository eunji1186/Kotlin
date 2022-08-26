package section1

open class Animal(val name: String)

class Dog(name: String, override var category: String) : Animal(name), Pet{
    override fun feeding(){
        println("Feed the dog a bone")
    }
}

class CAt(name: String, override var category: String) : Pet, Animal(name){
    override fun feeding(){
        println("Feed the cat a tuna can!")
    }
}

class Master{
    fun palyWithPet(dog: Dog){
        println("Enjoy with my dog.")
    }

    fun palyWithPet(cat: CAt){
        println("Enjoy with my cat.")
    }
}

fun main() {
    val master=Master()
    val dog=Dog("Toto", "Small")
    val cat=CAt("Coco", "BigFat")

    master.palyWithPet(dog)
    master.palyWithPet(cat)
}