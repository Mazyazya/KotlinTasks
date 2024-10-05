package Lab9

import kotlin.random.Random

fun main(){
    val randNum = Random.nextInt(0, 100)
    while(true) {
        print("Введите число: ")
        val num = readln().toInt()
        when {
            num > randNum -> println("Ваше число больше загаданного")
            num < randNum -> println("Ваше число меньше загаданного")
            else -> {println("Вы угадали"); break}
        }
    }
}