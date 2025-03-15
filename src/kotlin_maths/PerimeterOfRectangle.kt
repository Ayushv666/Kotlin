package kotlin_maths

fun main(){
    print("Length")
    val length = readlnOrNull()?.toDoubleOrNull()

    print("Breath")
    val breath = readlnOrNull()?.toDoubleOrNull()

    if(length != null && breath != null){
        val perimeter = 2 * (length + breath)
        println("Perimeter of rectangle is: $perimeter")
    }else{
        println("Please enter a valid number.")
    }
}