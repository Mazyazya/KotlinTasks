package Lab9

fun main() {
    println("Введите строку: ")
    val str = readln()
    println("В строке ${str.filter { it in "АОУЫЭЕЁИЮЯаоуыэеёиюя" }.length} гласных")
    println("В строке ${str.replace(" ","").filter { it !in "АОУЫЭЕЁИЮЯаоуыэеёиюя" }.length} согласных")
}
