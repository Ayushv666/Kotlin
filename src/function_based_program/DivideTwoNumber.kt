package function_based_program

fun div(x: Int,y: Int):Int{
    return (x / y)
}

fun main(){
    val num1 = 10
    val num2 = 10

    val result = div(num1,num2)
    println("The quotient of $num1 and $num2 is: $result")
}