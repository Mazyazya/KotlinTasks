package Lab5

fun main() {
    println("Введите первую строку")
    val a = readln()
    println("Введите вторую строку")
    val b = readln()
    if (isAnagram(a, b)) println("Слова $a и $b анаграммы")
    else println("Слова $a и $b не анаграммы")
}