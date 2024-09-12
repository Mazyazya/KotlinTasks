package Lab2

fun main() {
    val a = true; val b = false; val c = false
    println("A: ${a}\nB: ${b}\nC: ${c}")
    println("A или не (А и B) или С:\t ${a or !(a and b) or c}")
    println("не А или А и (В или С):\t ${!a or a and (b or c)}")
    println("(А или B и не C) и C:\t ${(a or b and !c) and c}")
}