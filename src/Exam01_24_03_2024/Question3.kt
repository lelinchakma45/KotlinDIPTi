package Exam01_24_03_2024

//Answer to the question no -03
fun main(){
    print("Enter a Number: ")
    var num = readLine()!!.toInt()
    if (num == 0){
        println("This is Zero Value")
    }
    else if(num > 0){
        println("This is Positive Value.")
    }
    else{
        println("This is Negative Value")
    }
}