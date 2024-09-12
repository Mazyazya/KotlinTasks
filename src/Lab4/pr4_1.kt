package Lab4

fun main(){
    print("Введите номер дня: ")
    val day = readln().toInt()
    when (day) {
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
    }
}