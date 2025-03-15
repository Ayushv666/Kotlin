package switch_case

fun main(){
    print("Enter the grade (A-E):")
    val grade = readlnOrNull()?.uppercase()

    val remark = when(grade){
        "A" -> "Excellent"
        "B" -> "Good"
        "C" -> "Satisfactory"
        "D" -> "Need Improvement"
        "E" -> "Fail"
        else -> "Invalid Input"
    }
    println("Remark:$remark")
}