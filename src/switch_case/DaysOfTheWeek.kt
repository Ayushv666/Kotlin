package switch_case

fun main(){
    print("Enter the number of the day:")
    val number = readlnOrNull()?.toIntOrNull()

    val dayOfWeek = when(number){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid. Please enter the valid number."
    }
    println("The day is $dayOfWeek.")
}