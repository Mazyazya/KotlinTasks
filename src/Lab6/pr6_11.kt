package Lab6

fun main(){
    val arr1 = IntArray(10)
    print("Массив-1: ")
    for(i in 0..9){
        arr1[i] = (1..10).random()
        print("${arr1[i]}  ")
    }
    val arr2 = IntArray(10)
    print("\nМассив-2: ")
    for(i in 0..9){
        arr2[i] = (1..10).random()
        print("${arr2[i]}  ")
    }

    val a = arr1.toSet().intersect(arr2.toSet())
    println("\nПересечения массивов: $a")
}