fun main(){
    println("Введите двузначное число: ")
    val a = readln().toInt()

    if ((a/10) > (a%10)) println("цифра ${a/10} больше")
    else if ((a/10) < (a%10)) println("цифра ${a%10} больше")
    else println("Цифры одинаковые")
}
