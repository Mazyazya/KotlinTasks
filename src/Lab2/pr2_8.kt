package Lab2

fun main() {
    val a = true; val b = false; val c = false
    println("A: ${a}\nB: ${b}\nC: ${c}")
    println("не А и B:\t ${!a and b}")
    println("А или не B:\t ${a or !b}")
    println("А и B или С: ${a and b or c}")
}