package Lab4

fun main(){
    print("Введите код ошибки: ")
    val str = readln()
    when (str) {
        "100" -> println("Информационные")
        "200" -> println("Успешные")
        "300" -> println("Перенаправление")
        "400" -> println("Ошибка клиента")
        "500" -> println("Ошибка сервера")
    }
}