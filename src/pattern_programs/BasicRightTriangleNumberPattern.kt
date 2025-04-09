package pattern_programs

fun main(){
    print("Enter the size:")
    val size = readlnOrNull()?.toIntOrNull()?:return

    for (i in 1..size){
        for (j in 1..i){
            print("$i")
        }
        println()
    }
}