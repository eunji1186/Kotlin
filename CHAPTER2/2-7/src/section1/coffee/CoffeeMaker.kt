package section1.coffee

class CoffeeMaker(val coffeeModule: CoffeeModule){
    fun brew(){
        val theSiphon: Thermosiphon=coffeeModule.getThermosiphon()

        theSiphon.on()
        theSiphon.pump()

        println("Coffee, here! Enjoy!~")

        theSiphon.off()
    }
}

fun main() {
    val coffeeMaker=CoffeeMaker(MyDripCoffeeModule())

    coffeeMaker.brew()
}