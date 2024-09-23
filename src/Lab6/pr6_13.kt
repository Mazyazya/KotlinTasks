package Lab6

fun main(){
    val a = IntArray(20)
    println("Массив: ")
    for (i in 0..19) {
        a[i] = (1..100).random()
        print("${a[i]} ")
    }
}