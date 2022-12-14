package section2

class SmartPhone(val model: String){
    private val cpu="Exynos"

    inner class ExternalStorage(val size: Int){
        fun getInfo()="${model}: INstalled on $cpu with ${size}Gb"
    }
}

fun main() {
    val mySdcard=SmartPhone("S7").ExternalStorage(32)

    println(mySdcard.getInfo())
}