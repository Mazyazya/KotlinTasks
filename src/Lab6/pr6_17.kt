package Lab6

fun main(){
    val a = IntArray(5)
    println("Массив: ")
    for (i in 0..4) {
        a[i] = (1..100).random()
        print("${a[i]} ")
    }
    println("")
    println("Сумма всех эементов массива: ${a.sum()}")
    println("Произведение всех эементов массива: ${a.reduce {x, y -> x * y}}")
}

