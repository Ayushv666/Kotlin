package function_based_program

fun square(number: Int):Int{
    return number * number
}

fun main(){
    print("Enter the number:")
    val number = readlnOrNull()?.toIntOrNull()

    if (number != null){
        val result = square(number)
        println("The square of the $number is $result")
    }
}