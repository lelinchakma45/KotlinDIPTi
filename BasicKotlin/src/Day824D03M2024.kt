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


    val scanner = Scanner(System.`in`)
    print("Enter Number One: ")
    var number1 = scanner.nextInt()
    print("Enter Number Two: ")
    var number2 = scanner.nextInt()

    if(number1 > number2){
        println("$number1 in Greather Than $number2")
    }
    else if(number1 < number2){
        println("$number1 is less than $number2")
    }
    else{
        println("Those Number is equal")
    }
}