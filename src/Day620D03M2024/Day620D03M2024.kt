package Day620D03M2024

import java.util.Scanner
fun main(){
//    val scanner = Scanner(System.`in`)
//    print("Enter Your Number: ")
//    var num1 = scanner.nextInt()
//    var num1 = scanner.nextInt()
//
//    println(num1)
//
//    print("Enter a Name: ")
//    val name = readLine()!!.toString()
//
//    when(name) {
//        "Rakib" ->
//            println("he is a student")
//        "Lelin","lelin" ->
//            println("He is a Student")
//        else -> println("No Student Found")
//    }
//
//    print("Enter a Number: ")
//    val number = scanner.nextInt()
//    when(number){
//        1 -> println("This is One")
//        2 -> println("This is Two")
//        3 -> println("This is Three")
//        else -> println("Not Found")
//    }
//
//    println("Enter a mixed input containing numbers and strings:")
//    val input = readLine() ?: ""
//    val tokens = input.split(" ")
//    for (token in tokens) {
//        val number = token.toIntOrNull()
//        if (number != null) {
//            println("Found number: $number")
//        } else {
//            println("Found string: $token")
//        }
//    }
//
//
//    print("Enter this month: ")
//    val monthofYear = readLine()!!.toInt()
//    var month = when(monthofYear){
//        1 -> "January"
//        2 -> "February"
//        3 -> "March"
//        4 -> "April"
//        5 -> "May"
//        6 -> "June"
//        7 -> "July"
//        8 -> "August"
//        9 -> "September"
//        10 -> "October"
//        11 -> "November"
//        12 -> "December"
//        else -> "No Define"
//    }
//    print("You are put $monthofYear and Month Name is `$month`")
//
//
    print("Enter a Name: ")
    val name = readLine()!!.toString()
    when(name){
        "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"-> print("Month Name")
        "Saturday", "Sunday", "Monday", "Tuesday", "Wednessday","Thursday", "Friday" -> print("It's Day")
        else -> print("No Month")
    }
//
//    print("Enter a Name: ")
//    val num1 = readLine()!!.toInt()
//
//    when(num1){
//        in 1..5 -> println("This is 1 to 5")
//        in 6..10 -> println("This is 6 to 10")
//        in 11.. 15 -> println("This is 11 to 15")
//        !in 16..20 -> println("This is not 10 to 20")
//    }



}