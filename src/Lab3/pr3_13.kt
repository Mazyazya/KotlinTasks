fun main(){
    println("Введите четырехзначное число: ")
    val number = readln()
    val a = number[0].toString().toInt()
    val b = number[1].toString().toInt()
    val c = number[2].toString().toInt()
    val d = number[3].toString().toInt()


    if (a + b == c + d) println("Сумма цифр $a и $b == сумме $c и $d")
    else println("Сумма цифр $a и $b != сумме $c и $d")
    if ((a + b + c + b) % 3 == 0) println("Сумма цифр кратна 3")
    else println("Сумма цифр не кратна 3")
    if ((a * b * c * b) % 4 == 0) println("Произведение цифр кратно 4")
    else println("Произведение цифр не кратно 4")
    if ((a * b * c * b) % a == 0) println("Произведение цифр кратно $a")
    else println("Произведение цифр не кратно $a")
}
