package Lab6

fun main(){
    print("Введите размер массива: ")
    val n = readln().toInt()
    val arr = IntArray(n)
    println("Массив: ")
    for (i in 0..n-1){
        arr[i] = (1..99).random()
        print("${arr[i]} ")
    }
    println()
    print("Введите число: ")
    val num = readln().toInt()
    if(num in arr) println("Такое число есть")
    else println("Такого числа нет")
}
