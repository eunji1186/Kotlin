package section6

class PAtient(val name: String, var id: Int){
    fun doctorList(d: DOctor){
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class DOctor(val name: String, val p: PAtient){
    val customerId: Int=p.id

    fun patientList(){
        println("Doctor: $name, Patient: ${p.name}")
        println("Patient Id: $customerId")
    }
}

fun main() {
    val patient1=PAtient("Kildong", 1234)
    val doc1=DOctor("KimSabu", patient1)

    doc1.patientList()
}