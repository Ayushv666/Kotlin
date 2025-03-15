package kotlin_maths

fun main(){
    print("Enter the x-coordinate")
    val x = readlnOrNull()?.toDoubleOrNull()

    print("Enter the y-coordinate")
    val y = readlnOrNull()?.toDoubleOrNull()

    if(x != null && y != null)
        if(x == 0.0 && y == 0.0){
            println("The point lies at the origin.")
        }else{
            if(x == 0.0){
                println("The point lies on the y axis.")
            }else{
                if(y == 0.0){
                    println("The point lies on the x axis.")
                }else{
                    if(x > 0 && y > 0){
                        println("The point lies on the first quadrant.")
                    }else{
                        if(x < 0 && y > 0){
                            println("The point lies on the second quadrant.")
                        }else{
                            if(x < 0 && y < 0){
                                println("The point lies on the third quadrant.")
                            }else{
                                println("The point on the fourth quadrant.")
                            }
                        }
                    }
                }
            }
        }
}