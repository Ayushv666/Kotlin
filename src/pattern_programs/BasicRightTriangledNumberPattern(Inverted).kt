package pattern_programs

fun main(){
    print("Enter the size:")
    val size = readlnOrNull()?.toIntOrNull()?:return

    for (i in size downTo 1){
        for (j in 1..i){
            print("$i")
        }
        println()
    }
}