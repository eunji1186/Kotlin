package section3

class Person{
    var id: Int=0
    var name: String="Youngdeok"
    companion object{
        var language: String="Korean"

        fun work(){
            println("working...")
        }
    }
}

fun main() {
    println(Person.language)

    Person.language="English"
    println(Person.language)

    Person.work()
    //println(Person.name)  name은 컴패니언 객체가 아니므로 오류
}