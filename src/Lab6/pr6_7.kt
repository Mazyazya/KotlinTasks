package Lab6

fun main(){
    val a = IntArray(10)
    println("Массив: ")
    for (i in 0..9) {
        a[i] = (1..100).random()
        print("${a[i]} ")
    }
    println("")
    println("Реверс массива: ")
    for (i in 0..9) {
        print("${a.reversed()[i]} ")
    }
}