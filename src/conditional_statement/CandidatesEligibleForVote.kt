package conditional_statement

fun main(){
    print("Enter the age of candidate")
    val age = readlnOrNull()?.toDoubleOrNull()

    if(age != null && age >= 18){
        println("Candidate is eligible for vote.")
    }else{
        println("Candidate is not eligible for vote.")
    }
}