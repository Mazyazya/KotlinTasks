package Lab9

fun main() {
    print("Введите длину пароля: ")
    val n = readln().toInt()

    print("Пароль заданной длины: ${passwordGenerator(n)}")
}

fun passwordGenerator(length: Int) : String {
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('!'..'?')
    return (1..length).map { allowedChars.random() }.joinToString("")
}