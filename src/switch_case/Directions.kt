package switch_case

fun main(){
    print("Enter the number (1-4):")
    val number = readlnOrNull()?.toIntOrNull()

    val direction = when(number){
        1 -> "East"
        2 -> "West"
        3 -> "North"
        4 -> "South"
        else -> "Invalid Input"
    }
    println("Direction:$direction.")
}