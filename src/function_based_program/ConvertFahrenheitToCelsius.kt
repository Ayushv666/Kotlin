package function_based_program

fun fahrenheitToCelsius(fahrenheit: Double):Double{
    return (fahrenheit - 32) * 5/9
}

fun main(){
    print("Enter the fahrenheit:")
    val fahrenheit = readlnOrNull()?.toDoubleOrNull()

    if (fahrenheit != null){
        val celsius = fahrenheitToCelsius(fahrenheit)
        println("Celsius:$celsius")
    }
}
