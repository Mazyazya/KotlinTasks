package Lab2

fun main() {
    print("Введите делимое: "); val dividend = readln().toDouble()
    print("Введите делитель: "); val divider = readln().toDouble()

    print("Результат деления: ${dividend/divider}")
}