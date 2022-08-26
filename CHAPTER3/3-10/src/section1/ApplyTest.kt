package section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person=Person("Kildong", "Kotlin")
        person.apply{this.skills="Swift"}
    println(person)

    val retrunObj=person.apply{
        name="Sean"
        skills="Java"
    }

    println(person)
    println(retrunObj)
}