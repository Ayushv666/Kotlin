package function_based_program

fun min(x: Int,y: Int):Int{
    return if (x < y) x else y
}

fun main(){
    val num1 = 10
    val num2 = 20

    val result = min(num1,num2)
    println("The minimum of $num1 and $num2 is: $result")
}