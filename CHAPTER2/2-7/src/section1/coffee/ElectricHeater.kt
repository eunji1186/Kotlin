package section1.coffee

class ElectricHeater(var heating: Boolean=false) : Heater{
    override fun on(){
        println("[ElectricHeater] headting...")

        heating=true
    }

    override fun off(){
        heating=false
    }

    override fun isHot(): Boolean=heating
}