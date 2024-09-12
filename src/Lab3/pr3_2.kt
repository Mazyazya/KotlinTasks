import kotlin.math.max
import kotlin.math.min

fun main(){
    println("Enter a number: ")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val maxNum = max(max(a, b), max(b, c))
    val minNum = min(min(a, b), min(b, c))
    if ((a == b) or (a == c) or (b == c))
        println("Ошибка")
    else if ((minNum < b) and (b < maxNum))
        println("Среднее число: ${b}")
    else if ((minNum < a) and (a < maxNum))
        println("Среднее число: ${a}")
    else
        println("Среднее число: ${c}")
}