package Lab5

fun main() {
    println("Введите число")
    val N = readln().toInt()
    var factorial: Int = 1
    for(i in 1..N){
        factorial *= i
    }
    println("Факториал числа $N = $factorial")
}