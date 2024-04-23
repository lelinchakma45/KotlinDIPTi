package Day824D03M2024

import java.util.Scanner
fun main(){
//    var a = 20
//    var b = 5
//
//    println(a==b)
//    println(a<b)
//    println(a>b)
//    println(a>=b)
//    println(a<=b)
//
//    println(a<b && a>b)
//    println(a<b || a>b)
//    println(a!=b)
//
//    println(++a)
//    println(--b)

//    val scanner = Scanner(System.`in`)
//    print("Enter Your Name: ")
//    var name = scanner.nextLine()
//    print("Enter Your Age: ")
//    var age = readLine()!!.toInt()
//    print("Enter Your Gender: ")
//    var gender = readLine()!!
//    print("Enter Your Year: ")
//    var year = scanner.nextInt()
//
//    print("My Name is $name. My age is $age and gender is $gender. My DOB is $year")


//    val scanner = Scanner(System.`in`)
//    print("Enter Number One: ")
//    var number1 = scanner.nextInt()
//    print("Enter Number Two: ")
//    var number2 = scanner.nextInt()
//
//    if(number1 > number2){
//        println("$number1 in Greather Than $number2")
//    }
//    else if(number1 < number2){
//        println("$number1 is less than $number2")
//    }
//    else{
//        println("Those Number is equal")
//    }

//    print("Enter Number One: ")
//    val scanner = Scanner(System.`in`)
//    var number1 = scanner.nextInt()
//    print("Enter Number Two: ")
//    var number2 = scanner.nextInt()
//    print("Enter Number Three: ")
//    var number3 = scanner.nextInt()
//
//    if (number1 > number2 && number1 > number3){
//        if (number2 == number3 && number2 < number1){
//            println("$number1 is bigger than other two Numbers")
//        }
//        else{
//            println("$number1 is biggest of these three numbers")
//        }
//    }
//    else if(number2> number1 && number2 > number3){
//        if (number3 == number1 && number1 < number2){
//            println("$number2 is bigger than other two Numbers")
//        }
//        else{
//            println("$number2 is biggest of these three numbers")
//        }
//    }
//    else if(number3> number1 && number3 > number2){
//        if (number1 == number2 && number1 < number3){
//            println("$number3 is bigger than other two Numbers")
//        }
//        else{
//            println("$number3 is biggest of these three numbers")
//        }
//    }
//    else if (number1 == number2 && number1 > number3){
//        println("$number1 and $number2 is Both Bigger Than $number3")
//    }
//    else if (number2 == number3 && number2 > number1){
//        println("$number2 and $number3 is Both  Bigger Than $number2")
//    }
//    else if (number3 == number1 && number1 > number2){
//        println("$number1 and $number3 is Both  Bigger Than $number2")
//    }
//    else{
//        println("All Number is equal")
//    }


    val num1 = 20
    val num2 = 5
    print("Enter Your Operator: ")
    var operator = readLine()!!
    var result = when(operator){
        "+" -> {num1+num2}
        "-" -> {num1-num2}
        "*" -> {num1*num2}
        "/" -> {num1/num2}
        "%" -> {num1%num2}
        else -> {"Non Operator"}
    }
    println(result)

    when(operator){
        "+" -> println(num1+num2)
        "-" -> println(num1-num2)
        "*" -> println(num1*num2)
        "/" -> println(num1/num2)
        "%" -> println(num1%num2)
        else -> println("No Operator")
    }
}