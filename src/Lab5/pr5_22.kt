package Lab5

fun main(){
    val N = (1..100).random()
    for (i in 1..5){
        println("Попытка $i/5")
        print("Угадайте число от 1 до 100: ")
        var a = readln().toInt()
        if (N == a) {println("Вы угадали!!!"); break}
        else if (i == 5) {println("Вы проиграли"); break}
        else println("Попробуйте еще раз\n")
    }
}