package pattern_programs

fun main(){
    val size = 5

    for (i in 1..size){
        for (j in 1..i){
            print("*")
        }
        println()
    }
    for (i in size - 1 downTo 1){
        for (j in 1..i){
            print("*")
        }
        println()
    }
}