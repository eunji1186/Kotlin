package section2

class PErson(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean=false
    val person1 : PErson by lazy{
        isPersonInstantiated=true
        PErson("Kim", 23)
    }
    val personDelegate=lazy{
        PErson("Hong", 40)
    }

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
    println("person.name=${person1.name}")
    println("personDelegate.value.name=${personDelegate.value.name}")

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}