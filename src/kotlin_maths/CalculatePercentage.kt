package kotlin_maths

fun main() {
    print("Enter the marks obtained")
    val obtainedmarks = readlnOrNull()?.toDoubleOrNull()

    print("Enter the total marks")
    val totalmarks = readlnOrNull()?.toDoubleOrNull()

    if (obtainedmarks != null && totalmarks != null){
        val percentage = (obtainedmarks / totalmarks) * 100
        println("Percentage:${"%.2f".format(percentage)}")
    }else{
        println("Invalid input. Please enter a valid number.")
    }
}