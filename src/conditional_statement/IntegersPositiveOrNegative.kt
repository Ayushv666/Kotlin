package conditional_statement

fun main(){
    print("Number")
    val number = readlnOrNull()?.toIntOrNull()

    if(number != null){
        if(number > 0){
            println("$number is positive.")
        }else{
            if(number < 0){
                println("$number is negative.")
            }else{
                println("$number is zero.")
            }
        }
    }
}