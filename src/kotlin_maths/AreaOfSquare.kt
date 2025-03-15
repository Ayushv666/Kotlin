package kotlin_maths

fun main(){
    print("Side")
    val sides = readlnOrNull()?.toDoubleOrNull()

    if(sides != null){
        val area = 2 * sides

        println("Area of Square is: $area")
    }else{
        println("Please enter a valid number.")
    }
}