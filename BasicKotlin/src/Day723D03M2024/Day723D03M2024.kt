package Day723D03M2024

fun main(){
    var name:String = "Lelin Chakma"
    var age:Int = 25
    var salary:Double = 25.59
    var gender:Char = 'M'
    var isMarrid:Boolean = true

    println("My name is $name. my age is $age. my salary is $salary. " +
            "My Gender is Male($gender). My Marrid Status is $isMarrid")

    println(name + age )

    var num1 = 25
    var num2 = 5

    var sum = num1 + num2
    var sub = num1 - num2
    var mul = num1 * num2
    var div = num1 / num2
    var mod = num1 % num2

    println(sum)
    println(sub)
    println(mul)
    println(div)
    println(mod)

    num1 /= 5
    println(num1)

    num2 %= 2
    println(num2)
}