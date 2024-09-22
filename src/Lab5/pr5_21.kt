package Lab5

import java.time.LocalDate
import java.time.Month
import java.time.format.DateTimeFormatter

fun main() {
    println("Введите год")
    val year = readln().toInt()
    println("Введите месяц цифрой")
    val m = readln().toInt()
    val month = Month.of(m)
    for (day in 1..month.length(LocalDate.of(year, month, 1).isLeapYear)) {
        println(LocalDate.of(year, month, day).format(DateTimeFormatter.ofPattern("dd.MM.yyyy")))
    }
}
