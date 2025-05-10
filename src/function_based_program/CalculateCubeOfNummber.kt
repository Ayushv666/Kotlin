package function_based_program

fun cube(number: Int):Int{
    return number * number * number
}

fun main(){
    print("Enter the number:")
    val number = readlnOrNull()?.toIntOrNull()

    if (number != null){
        val result = cube(number)
        println("The square of the $number is $result")
    }
}