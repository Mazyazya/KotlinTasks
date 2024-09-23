package Lab6

fun main() {
    print("Введите размер массива: ")
    val n = readln().toInt()
    val arr = IntArray(n)
    println("Массив: ")
    for(i in 0..n-1){
        arr[i] = readln().toInt()
    }
    println("Ваш массив: ${arr.joinToString("  ")}")
}