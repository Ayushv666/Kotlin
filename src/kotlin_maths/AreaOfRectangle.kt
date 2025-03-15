package kotlin_maths

fun main(){
    print("Length")
    val length = readlnOrNull()?.toDoubleOrNull()

    print("Breath")
    val breath = readlnOrNull()?.toDoubleOrNull()

    if(length != null && breath != null){
        val area = length * breath

        println("Area of rectangle is: $area")
    }else{
        println("Please enter a valid number.")
    }
}