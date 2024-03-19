import java.util.Scanner
fun main(){
    var number = 1
    while (number < 10){
        println(number)
        number++
    }


    var names = arrayOf("Lelin Chakma", "Md Shakil", "Tansen","Tanay Dewan", "Rimon Talukder")

    var num = 0
    while (num < names.size){
        println(names[num])
        num++
    }


    var fixnum = 4
    var counter = 1

    do{
        var multiplication = fixnum * counter
        println("4 x $counter = $multiplication")
        counter++
    }
    while (counter <= 10)


    for (i in 100 downTo 0 step 10){
        println(i)
    }


    val numbers = arrayOf(1,2,3,4,5,6)
    for (num in numbers){
        if (num % 2 == 0){
            println(num)
        }
    }

//    val personNames = listOf(
//        "Amir Hossain", "Lelin Chakma", "Md Shakil", "Seam Ahamed",
//        "Rajib Hasan", "Md Maruf", "Md Tazul Islam", "Pronob Kumar",
//        "Shohorab Hassain", "Saber Rahman Talukder", "Mahmudunnabi", "Tansen"
//    )
//    for (i in 0..personNames.size){
//        println("$i : ${personNames[i]}")
//    }

    val personNames = listOf(
        "Amir Hossain", "Lelin Chakma", "Md Shakil", "Seam Ahamed",
        "Rajib Hasan", "Md Maruf", "Md Tazul Islam", "Pronob Kumar",
        "Shohorab Hassain", "Saber Rahman Talukder", "Mahmudunnabi", "Tansen"
    )
    for (i in personNames.indices){
        println(personNames[i])
    }

    val persons = arrayOf(
        "Amir Hossain", "Lelin Chakma", "Md Shakil", "Seam Ahamed",
        "Rajib Hasan", "Md Maruf", "Md Tazul Islam", "Pronob Kumar",
        "Shohorab Hassain", "Saber Rahman Talukder", "Mahmudunnabi", "Tansen"
    )
    for ((i, value )in persons.withIndex()){
        println("Elements of $i : $value")
    }


}