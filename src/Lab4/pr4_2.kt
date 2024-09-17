package Lab4

fun main(){
    print("Введите число: ")
    val a = readln().toInt(); val b = readln().toInt(); val c = readln().toInt()
    when (a == b) {
        true -> when (b == c){
            true -> println("Треугольник равносторонний")
            false -> println("Треугольник равнобедренный")
        }
        false -> when ((b == c) or (b == c)){
            true -> println("Треугольник равнобедренный")
            false -> println("Треугольник разносторонний")
        }
    }
}