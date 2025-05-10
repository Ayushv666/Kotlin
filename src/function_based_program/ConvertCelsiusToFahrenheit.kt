package function_based_program

fun celsiusToFahrenheit(celsius: Double):Double{
    return (celsius * 9/5)+32
}

fun main(){
    print("Enter the celsius:")
    val celsius = readlnOrNull()?.toDoubleOrNull()

    if (celsius != null){
        val fahrenheit = celsiusToFahrenheit(celsius)
        println("Fahrenheit:$fahrenheit")
    }
}
