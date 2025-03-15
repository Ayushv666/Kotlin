package pattern_programs

fun main(){
    print("Enter the number.")
    val number = readlnOrNull()?.toIntOrNull()

    if (number != null){
        for (i in 1..number){
            for (j in 1..number){
                print("*")
            }
            println()
        }
    }
}