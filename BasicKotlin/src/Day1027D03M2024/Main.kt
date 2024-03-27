package Day1027D03M2024

fun main() {
    val fruit= Fruits()
    fruit.name = "Mango"
    fruit.review()

    var myCar = Cars()
    myCar.brandName = "Toyota"
    myCar.modelName = "Corolla TX1030"
    myCar.speed = "180K/h"
    myCar.details()

    println(sum(10,20))

}
fun sum(a:Int,b:Int):Int{
    var addition = a+ b
    return addition
}