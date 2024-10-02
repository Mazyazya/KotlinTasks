package Lab8

fun main() {
    println("Введите строку: ")
    val str = readln()
    println("Введите подстроку: ")
    val substr = readln()
    if (substring(str, substr)) println("Строка является подстрокой")
    else println("Строка не является подстрокой")
}

fun substring(str: String, substr: String): Boolean = str.contains(substr)