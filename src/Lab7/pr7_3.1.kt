package Lab7

fun main() {
    print("Введите количество побед: ")
    val victories = readln().toInt()
    print("Введите количество ничейных: ")
    val draws = readln().toInt()
    print("Введите колчисество поражений: ")
    val defeats = readln().toInt()
    print("Количество очков команды: ${victories * 3 + draws * 1}")
}
