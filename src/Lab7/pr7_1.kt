package Lab7

fun main(){
    try {
        print("Введите действие (# + #): ")
        var act = readln().split(" ")
        if (act.size != 3 || act[1] !in "+-*/%".split("")) throw NumberFormatException()
        var result = action(act[0].toDouble(), act[2].toDouble(), act[1].single())

        while (true) {
            println("Результат: ${result}")
            println("Введите следующее действие (или пустую строку, чтобы остановить): ")
            print("$result ")
            act = readln().split(" ")
            if (act.size == 1) break
            if (act.size != 2 || act[0] !in "+-*/%".split("")) throw NumberFormatException()
            result = action(result, act[1].toDouble(), act[0].single())
        }
    }
    catch (e: NumberFormatException) {
        println("Неверно оформлено действие")
    }
    finally {
        println("Программа завершена")
    }
}

fun action(a: Double, b:Double, sign: Char): Double{
    when (sign) {
        '/' -> return a / b
        '*' -> return a * b
        '+' -> return a + b
        '-' -> return a - b
        '%' -> return a % b
        else -> return 0.0
    }
}