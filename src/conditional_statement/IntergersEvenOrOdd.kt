package conditional_statement

fun main(){
    print("Number")
    val number = readlnOrNull()?.toIntOrNull()

    if(number != null){
        if( number % 2 == 0){
            println("$number is even.")
        }else{
            println("$number is odd.")
        }
    }
}