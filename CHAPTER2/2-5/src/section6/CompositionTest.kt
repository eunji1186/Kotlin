package section6

class Car(val name: String, val power: String){
    private var engine=Engine(power)

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power: String){
    fun start() = println("Engine has ben started.")
    fun stop() = println("Engine has been stopped.")
}

fun main() {
    val car = Car("tico", "100hp")

    car.startEngine()
    car.stopEngine()
}