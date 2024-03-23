
//Answer to the question no -04
fun main(){
    print("Enter First Number :")
    var num1 = readLine()!!.toInt()
    print("Enter Second Number:")
    var num2 = readLine()!!.toInt()
    var gcdresult = 1

    var i = 1
    while (num1 >= 1 || num2 >= 1){
        if (num1 % i == 0 || num2 % i == 0 ){
            gcdresult = i
            i++
        }
    }
    println("My GCD Result is $gcdresult")
}