import kotlin.math.max

fun main(){
    println("Enter a number: ")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    println(max(max(a, b), max(b, c)))
}