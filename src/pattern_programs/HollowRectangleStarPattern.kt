package pattern_programs

fun main(){
    print("Enter the size:")
    val size  = readlnOrNull()?.toIntOrNull()?:return

    for (i in 0..size - 2){
        for (j in 1..size){
            if (i == 0 || i == size - 2 || j == 1 || j == size){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
    }
}