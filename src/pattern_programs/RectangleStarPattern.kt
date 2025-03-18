package pattern_programs

fun main(){
    print("Enter the number:")
    val size = readlnOrNull()?.toIntOrNull()

    if (size != null){
        for (i in 0..size - 2){
            for (j in 1..size){
                print("*")
            }
            println()
        }
    }
}