package Lab5

fun main() {
    println("Введите число")
    val N = readln().toInt()
    var sum: Int = 0
    for(i in 1..N){
        sum += i
    }
    println("Сумма чисел от 1 до $N = $sum")
}