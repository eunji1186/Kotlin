package section1.customgetest

class USEr(_id: Int, _name: String, _age: Int){
    val id: Int=_id
    var name: String=_name
        set(value){
            println("The name was changed")

            field=value.toUpperCase()
        }

    var age: Int=_age
}

fun main() {
    val user1=USEr(1, "kildong", 35)

    user1.name="coco"

    println("user3.name=${user1.name}")
}