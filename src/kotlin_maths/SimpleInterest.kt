package kotlin_maths

fun main(){
    print("Principal")
    val principal = readlnOrNull()?.toDoubleOrNull()

    print("Rate")
    val rate = readlnOrNull()?.toDoubleOrNull()

    print("Time")
    val time = readlnOrNull()?.toDoubleOrNull()

    if( principal != null && rate != null && time != null){
        val simpleInterest = (principal * rate * time) / 100

        println("Simple Interest:$simpleInterest")
    } else {
        println("Print enter a valid number.")
    }
}