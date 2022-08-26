package section5

open class Base{
    protected var i=1
    protected fun protectedFunc(){
        i+=1
    }

    fun access(){
        protectedFunc()
    }

    protected class Nested //내부 클래스에는 지시자 허용
}

class Derived : Base(){
    fun test(base: Base): Int{
        protectedFunc()

        return i
    }
}

fun main() {
    val base=Base()

    //base.i    접근 불가
    //base.protectedFunc()  접근 불가
    base.access()
}