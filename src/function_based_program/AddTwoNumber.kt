package function_based_program

fun add(x: Int,y: Int):Int{
    return (x + y)
}

fun main(){
    val num1 = 10
    val num2 = 10

    val result = add(num1,num2)
    println("The sum of $num1 and $num2 is: $result")
}