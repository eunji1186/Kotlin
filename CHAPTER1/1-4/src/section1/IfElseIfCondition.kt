package section1

fun main() {
    println("Enter the score: ")

    val score = readLine()!!.toDouble()
    var grade: Char='f'

    if(score >= 90.0){
        grade='A'
    }

    else if(score >=80.0 && score <= 89.9){
        grade='B'
    }

    else if(score >= 70.0 && score <= 79.9){
        grade='C'
    }

    println("Score: $score, Grade: $grade")
}