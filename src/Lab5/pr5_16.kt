package Lab5

fun main() {
    print("Введите число N: ")
    val N = readln().toInt()
    var sum = 0
    for(i in 1..N) {
        sum += i * i
    }
    println("Сумма квадратов от 1 до $N = $sum")
}