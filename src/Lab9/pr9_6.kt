package Lab9

fun main() {
    print("Введите количество строк: ")
    val n = readln().toInt()
    val list = strGen(n)
    println("Строки:\n${list.joinToString("\n")}")
    println()
    println("Отсортированные строки:\n${list.sorted().joinToString("\n")}")
}

fun strGen(length: Int) : List<String> {
    val allowedChars = ('А'..'Я') + ('а'..'я')
    val list = mutableListOf<String>()
    for (i in 0..length)
        list.add((1..5).map { allowedChars.random() }.joinToString(""))
    return list
}