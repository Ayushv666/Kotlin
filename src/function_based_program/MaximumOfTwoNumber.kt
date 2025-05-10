package function_based_program

fun max(x: Int,y: Int):Int{
    return if (x > y) x else y
}

fun main(){
    val num1 = 10
    val num2 = 20

    val result = max(num1,num2)
    println("The maximum of $num1 and $num2 is: $result")
}