package function_based_program

import kotlin.math.pow

fun calculateCompoundInterest(amount: Double, principal: Double, rate: Double, n: Double, N: Double):Double{
    return principal * (1 + (rate / n)).pow(N)
    return amount - principal
}

fun main() {
    print("Amount")
    val amount = readlnOrNull()?.toDoubleOrNull()

    print("Principal")
    val principal = readlnOrNull()?.toDoubleOrNull()

    print("Rate")
    val rate = readlnOrNull()?.toDoubleOrNull()

    print("n (Number of time interest per time period)")
    val n = readlnOrNull()?.toDoubleOrNull()

    print("N (Number of time period)")
    val N = readlnOrNull()?.toDoubleOrNull()

    if(amount != null && principal != null && rate != null && n != null && N != null){
        val compountInterest = calculateCompoundInterest(amount, principal, rate, n, N)

        println("Compound Interest:$compountInterest")
    } else {
        println("Please enter a valid number.")
    }
}