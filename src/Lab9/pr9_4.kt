package Lab9

fun main() {
    println("Введите первую строку")
    val a = readln()
    println("Введите вторую строку")
    val b = readln()
    if (isAnagram(a, b)) println("Слова $a и $b анаграммы")
    else println("Слова $a и $b не анаграммы")
}

fun isAnagram(a: String, b: String): Boolean{
    val sortA = a.replace(" ","").lowercase().toCharArray().sorted()
    val sortB = b.replace(" ","").lowercase().toCharArray().sorted()
    return sortA == sortB
}