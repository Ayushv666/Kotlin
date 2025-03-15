package switch_case

fun main(){
    print("Enter a number")
    val number = readlnOrNull()?.toIntOrNull()
    val numbers = intArrayOf(1,2,3,4,5)

    if (number != null && number in numbers){
        println("The number is:$number")
    }else{
        println("The number is something else.")
    }
}