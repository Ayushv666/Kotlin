package pattern_programs

fun main(){
    val size = 5

    for (i in 1..size){
        for (j in 1..(size - i)){
            print(" ")
        }
        for (j in 1..<2 * i){
            print("*")
        }
        println()
    }
}