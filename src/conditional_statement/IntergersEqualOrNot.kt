package conditional_statement

fun main(){
    print("Num1")
    val num1 = readlnOrNull()?.toIntOrNull()

    print("Num2")
    val num2 = readlnOrNull()?.toIntOrNull()

    if(num1 == num2){
        println("Number1 and Number2 are equal.")
    }else{
        println("Number1 and Number2 are not equal.")
    }
}