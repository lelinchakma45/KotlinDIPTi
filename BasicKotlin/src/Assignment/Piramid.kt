package Assignment

fun main() {
    val rows = 6
    for (i in 1..rows) {
        for (j in 1..rows - i){
            print("  ")
        }
        for (k in 1..(2 * i - 1)){
            print("* ")
        }
        println()
    }
}
