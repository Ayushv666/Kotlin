package switch_case

fun main(){
    print("Enter the number:")
    val number = readlnOrNull()?.toIntOrNull()

    val name = when(number){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        6 -> "Six"
        7 -> "Seven"
        8 -> "Eight"
        9 -> "Nine"
        10 -> "Ten"
        else -> "Invalid Input."
    }
    println("Number name:$name.")
}