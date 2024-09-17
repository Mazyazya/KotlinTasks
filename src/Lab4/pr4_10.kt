package Lab4

fun main(){
    print("Введите способ оплаты: ")
    val str = readln()
    when (str.lowercase()) {
        "наличие" -> println("Давайте свои деньги")
        "кредитная карта" -> println("Давайте свои кредиты")
        "paypal" -> println("Давайте свои PayPalы")
    }
}