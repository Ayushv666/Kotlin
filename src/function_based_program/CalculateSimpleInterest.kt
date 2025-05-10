package function_based_program

fun calculateSimpleInterest(principal: Double, rate: Double, time: Double):Double{
    return (principal * rate * time) / 100
}

fun main(){
    print("Principal")
    val principal = readlnOrNull()?.toDoubleOrNull()

    print("Rate")
    val rate = readlnOrNull()?.toDoubleOrNull()

    print("Time")
    val time = readlnOrNull()?.toDoubleOrNull()

    if( principal != null && rate != null && time != null){
        val simpleInterest = calculateSimpleInterest(principal, rate, time)

        println("Simple Interest:$simpleInterest")
    } else {
        println("Print enter a valid number.")
    }
}