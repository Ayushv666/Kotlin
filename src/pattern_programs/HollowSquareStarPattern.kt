package pattern_programs

fun main(){
    print("Enter the size.")
    val n  = readlnOrNull()?.toIntOrNull()?:return

    for (i in 1..n){
        for (j in 1..n){
            if (i == 1 || i == n || j == 1 || j == n){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
    }
}