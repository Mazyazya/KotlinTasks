package Lab6

fun main(){
    val arr = IntArray(10)
    println("Массив: ")
    for (i in 0..9) {
        arr[i] = (1..100).random()
        print("${arr[i]} ")
    }
    val b = arr
    println("")
    println("Скопированный массив")
    for (i in 0..9) {
        print("${b[i]} ")
    }
}