package recursion_program

fun factorial(n:Int):Long{
    return if (n==1)1 else n * factorial(n-1)
}

fun main(){
    print("Enter the number:")
    val number = readlnOrNull()?.toIntOrNull()

    if (number != null) {
        val result = factorial(number)
        println("Factorial of $number is $result")
    }
}