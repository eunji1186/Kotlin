package section1

class User(_id: Int, _name: String, _age: Int){
    val id: Int=_id
    val name: String=_name
    var age: Int=_age
}
//class User(val id: Int, var name: String, var age: Int) 와 같은 표현

fun main(){
    val user=User(1, "Sean", 30)
    val name=user.name

    user.age=41

    println("name: $name, ${user.age}")
}