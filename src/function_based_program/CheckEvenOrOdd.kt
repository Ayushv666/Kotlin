package function_based_program

fun isEven(number: Int):Boolean{
    return number % 2 == 0
}

fun main() {
    print("Enter the number:")
    val number = readlnOrNull()?.toIntOrNull()

    if (number != null){
        if (isEven(number)){
            println("$number is even.")
        }else{
            println("$number is odd.")
        }
    }
}