package section2

class SMartPhone(val model: String){
    private val Cpu="Exynos"

    inner class EXternalStorage(val size: Int){
        fun GetInfo()="${model}: INstalled on $Cpu with ${size}Gb"
    }

    fun powerOn(): String{
        class Led(val color: String){
            fun blink(): String="Blinking $color on $model"
        }

        val powerStatus=Led("Red")

        return powerStatus.blink()
    }
}

fun main() {
    val mySdcard=SMartPhone("S7").EXternalStorage(32)
    println(mySdcard.GetInfo())

    val myphone=SMartPhone("Note9")
    myphone.EXternalStorage(128)
    println(myphone.powerOn())
}