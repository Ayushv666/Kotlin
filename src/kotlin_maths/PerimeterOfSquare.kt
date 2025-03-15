package kotlin_maths

fun main(){
    print("Side")
    val sides = readlnOrNull()?.toDoubleOrNull()

    if(sides != null){
        val perimeter = 4 * sides
        println("Area of Square is: $perimeter")
    }else{
        println("Please enter a valid number.")
    }
}