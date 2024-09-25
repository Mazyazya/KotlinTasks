package Lab6

fun main(){
    var arr = IntArray(10)
    print("Массив: ")

    for(i in 0..9){
        arr[i] = (1..100).random()
        print("${arr[i]}  ")
    }

    print("\nВведите индекс элемента, который хотите удалить: ")
    val index = readln().toInt()
    arr = arr.filterIndexed{ i, _ -> i != index }.toIntArray()

    print("Полученный массив: ${arr.joinToString("  ")}")
}