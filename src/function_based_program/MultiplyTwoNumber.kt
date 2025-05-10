package function_based_program

fun product(x: Int,y: Int):Int{
    return (x * y)
}

fun main(){
    val num1 = 10
    val num2 = 10

    val result = product(num1,num2)
    println("The product of $num1 and $num2 is: $result")
}