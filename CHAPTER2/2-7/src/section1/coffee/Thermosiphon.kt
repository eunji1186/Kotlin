package section1.coffee

class Thermosiphon(heater: Heater) : Pump, Heater by heater{
    override fun pump(){
        if(isHot()){
            println("[Thermosiphon] pumping...")
        }
    }
}