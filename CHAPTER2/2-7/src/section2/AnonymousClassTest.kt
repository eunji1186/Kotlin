package section2

import sun.net.idn.StringPrep

interface Swicher{
    fun on(): String
}

class SMArtPhone(val model: String){
    private val CPu="Exynos"

    inner class EXTernalStorage(val size: Int){
        fun GEtInfo()="${model}: INstalled on $CPu with ${size}Gb"
    }

    fun PowerOn(): String{
        class LEd(val color: String){
            fun blink(): String="Blinking $color on $model"
        }

        val powerStatus=LEd("Red")
        val powerSwitch=object : Swicher{
            override fun on(): String{
                return powerStatus.blink()
            }
        }
        return powerStatus.blink()
    }
}

fun main() {
    val MySdcard=SMArtPhone("S7").EXTernalStorage(32)
    println(MySdcard.GEtInfo())

    val Myphone=SMArtPhone("Note9")
    Myphone.EXTernalStorage(128)
    println(Myphone.PowerOn())
}