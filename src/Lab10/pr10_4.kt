package Lab10

fun main(){
    print("Введите количество натуральных чисел: ")
    val n = readln().toInt()
    print("Последовательность: ${fizzleBizzle(n)}")
}

fun fizzleBizzle(n: Int) : List<Any>{
    val list = mutableListOf<Any>()
    for (i in 1..n)
        when{
            i % 3 == 0 && i % 5 == 0 -> list.add("ВизллБизлл")
            i % 3 == 0 -> list.add("Физллл")
            i % 5 == 0 -> list.add("Бизллл")
            else -> list.add(i)
        }
    return list
}