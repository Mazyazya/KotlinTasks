package Lab9

import kotlin.random.Random

fun main(){
    print("Случайные числа: ")
    for (i in 0..9){
        print("${Random.nextInt(0, 100)} ")
    }
}