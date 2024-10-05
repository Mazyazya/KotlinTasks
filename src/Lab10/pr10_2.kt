package Lab10

fun main(){
    print("Введите количество натуральных чисел: ")
    val n = readln().toInt()
    print("Последовательность:\n${pyramide(n).joinToString("\n")}")
}

fun pyramide(number: Int) : List<String>{
    val list = mutableListOf<String>()
    for (i in 1..number){
        list.add(" ".repeat(((number * 2 - 1) - (i * 2 - 1)) / 2)+
                "#".repeat(i * 2 - 1)+
                " ".repeat(((number * 2 - 1) - (i * 2 - 1)) / 2))
    }
    return list
}