package kotlin_maths

fun main(){
    print("Enter the cost price")
    val costprice = readlnOrNull()?.toDoubleOrNull()

    print("enter the selling price")
    val sellingprice = readlnOrNull()?.toDoubleOrNull()

    if (costprice != null && sellingprice != null)
        if (costprice == sellingprice) {
            println("No Profit or Loss.")
        }
    if (costprice!! < sellingprice!!){
        val ProfitOrLoss = sellingprice - costprice
        println("Profit:$ProfitOrLoss")
    }
    if (costprice > sellingprice){
        val ProfitOrLoss = costprice - sellingprice
        println("Loss:$ProfitOrLoss")
    }
}