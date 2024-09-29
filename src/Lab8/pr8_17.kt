package Lab8

fun main() {
    print("Введите число: ")
    val a = readln().toInt()
    println("Четное ли число: ${factorial(a)}")
}

fun  factorial(a: Int): Int {
    var factorial = 1
    for(i in 1..a){
        factorial *= i
    }
    return factorial
}