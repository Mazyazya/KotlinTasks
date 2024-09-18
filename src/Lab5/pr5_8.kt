package Lab5

fun main() {
    println("Введите два числа")
    var a = readln().toInt(); var b = readln().toInt()
    var c = 0;
    while(a % b != 0){
        c = a % b
        a = b
        b = c
    }
    print("НОД = $c")

}
