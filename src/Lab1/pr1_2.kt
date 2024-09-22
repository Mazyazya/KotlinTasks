package Lab1

fun main() {
    print("Enter a number: ")
    var num = readln().toDouble()
    println("Your number is ${String.format("%.3f", num)}")
}

