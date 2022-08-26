package section1

fun main() {
    data class User(val name: String, var skills: String, var email: String?=null)
    val user=User("Kildong", "default")

    val result=with(user){
        skills="Kotlin"
        email="kildong@example.com"
    }

    println(user)
    println("result: $result")
}
