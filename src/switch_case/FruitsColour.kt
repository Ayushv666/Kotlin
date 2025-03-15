package switch_case

fun main(){
    print("Enter the fruit name:")
    val fruit = readlnOrNull()?.uppercase()

    val color = when(fruit){
        "APPLE" -> "Red"
        "MANGO" -> "Yellow,Orange or Green"
        "GRAPES" -> "Green"
        "BANANA" -> "Yellow"
        "KIWI" -> "Brown with green inside"
        "ORANGE" -> "Orange"
        "POMEGRANATE" -> "Red"
        "PAPAYA" -> "Yellow with orange inside"
        "GUAVA" -> "Green"
        "STRAWBERRY" -> "Pink and Red"
        else -> "Invalid Input"
    }
    println("The color of $fruit is $color.")
}
