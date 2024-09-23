package Lab6

fun main(){
    val arr = IntArray(10)
    println("Массив: ")
    for (i in 0..9) {
        arr[i] = (1..100).random()
        print("${arr[i]} ")
    }
    println()
    print("Введите число: ")
    val number = readln().toInt()
    println("Индекс числа $number = ${arr.indexOf(number)}")
}