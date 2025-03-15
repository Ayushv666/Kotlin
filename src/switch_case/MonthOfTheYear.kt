package switch_case

fun main(){
print("Enter the number of the month:")
val number = readlnOrNull()?.toIntOrNull()

val dayOfMonth = when(number){
    1 -> "January"
    2 -> "February"
    3 -> "March"
    4 -> "April"
    5 -> "May"
    6 -> "June"
    7 -> "July"
    8 -> "August"
    9 -> "September"
    10 -> "October"
    11 -> "November"
    12 -> "December"
    else -> "Invalid. Please enter the valid number."
}
println("The month is $dayOfMonth.")
}