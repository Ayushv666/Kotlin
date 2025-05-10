package function_based_program

fun sub(x: Int,y: Int):Int{
    return (x - y)
}

fun main(){
    val num1 = 50
    val num2 = 10

    val result = sub(num1,num2)
    println("The difference of $num1 and $num2 is: $result")
}