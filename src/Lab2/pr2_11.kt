package Lab2

fun main() {
    val x = false; val y = false; val z = true
    println("X: ${x}\nY: ${y}\nZ: ${z}")
    println("X или Y и не Z:\t\t ${x or y and !z}")
    println("не X и не Y:\t\t ${!x and !y}")
    println("X и (не Y или Z):\t ${x and (!y or z)}")
    println("не (X и Y) или Z:\t ${!(x and y) or z}")
    println("X или (не (Y или Z): ${x or (!(y or z))}")
}