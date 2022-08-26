package section1

class USer(_id: Int, _name: String, _age: Int) {
    val id: Int=_id
        get()=field

    var name: String=_name
        get()=field

        set(value){
            field=value
        }

    var age: Int=_age
        get()=field

        set(value){
            field=value
        }
}

fun main() {
    val user=USer(1, "Kildong", 30)

    //user.id=2    val 프로퍼티는 값 변경 불가
    user.age=35

    println("user.age = ${user.age}")
}