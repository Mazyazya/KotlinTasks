package Lab10

fun main(){
    print("Введите количество натуральных чисел: ")
    val n = readln().toInt()
    print("Последовательность: ${printNumber(n)}")
}

fun printNumber(n: Int) : List<Int>{
    val list = mutableListOf<Int>()
    for (i in n downTo 1)
        list.add(i)
    return list
}