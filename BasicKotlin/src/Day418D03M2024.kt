import java.util.Scanner
import java.util.Random

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter Group Members Number: ")
    var how = scanner.nextInt()
    val personNames = arrayOf(
        "Amir Hossain", "Lelin Chakma", "Md Shakil", "Seam Ahamed",
        "Rajib Hasan", "Md Maruf", "Md Tazul Islam", " Pronob Kumar",
        "Shohorab Hassain", "Saber Rahman Talukder", "Mahmudunnabi", "Tansen"
    )
    val selectedPersons = mutableSetOf<String>()
    val randoms = Random()
    var i = 1
    while (selectedPersons.size < personNames.size) {
        val randomPersons = mutableListOf<String>()
        while (randomPersons.size < how) {
            val randomIndex = randoms.nextInt(personNames.size)
            val personName = personNames[randomIndex]
            if (!selectedPersons.contains(personName)){
                randomPersons.add(personName)
                selectedPersons.add(personName)
            }
        }
        println("Random $how Names for Group $i : $randomPersons")
        i++
    }

    /*Array MutableListof */

    /*val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 10, 12)
    numbers.add(9)
    numbers.add(14 + 1)
    numbers.removeAt(0)
    numbers[1] = 23
    println(numbers)*/
}
