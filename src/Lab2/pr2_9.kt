package Lab2

fun main() {
    val x = true; val y = true; val z = false
    println("X: ${x}\nY: ${y}\nZ: ${z}")
    println("не X и Y:\t ${!x and y}")
    println("X или не Y:\t ${x or !y}")
    println("X или Y и Z: ${x or y and z}")
}