package conditional_statement

fun main(){
    print("Year")
    val year = readlnOrNull()?.toIntOrNull()

    if(year != null){
        if(year % 4 == 0){
            println("$year is leap year.")
        }else{
            println("$year is not leap year.")
        }
    }
}