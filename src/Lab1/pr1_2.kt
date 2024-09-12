package Lab1

fun main() {
    print("Enter a number: ")
    var num = readln().toDouble()
    num = String.format("%.3f", num).toDouble()
    println("Your number is $num")
}