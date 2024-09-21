package Lab5

fun main() {
    println("Введите нижнюю границу интервала")
    val a = readln().toInt()
    println("Введите верхнюю границу интервала")
    val b = readln().toInt()
    for (i in a..b)
        if (isSimple(i)) println(i) // метод isSimple из pr5_5.kt
}

