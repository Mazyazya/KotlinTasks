package Lab5

fun main(){
    print("Введите количество чисел: ")
    val N = readln().toInt()
    val a = arrayOfNulls<Int>(N)
    print("Введите числа: ")
    for (i in 0..N-1){
        a[i] = readln().toInt()
    }
    a.sort()
    println("Отсоритрованная последовательность")
    for (i in a){
        print("$i ")
    }
}