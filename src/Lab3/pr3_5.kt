fun main(){
    println("Введите стороны треугольника: ")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    if ((a < b + c) and (b < a + c) and (c < a + b)) println("Треугольник существует")
    else println("Треугольник не существует")
}