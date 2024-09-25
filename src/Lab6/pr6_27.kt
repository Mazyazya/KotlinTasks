package Lab6

fun findMaxSequence(numbers: List<Int>): Pair<Int, Int> {
    if (numbers.isEmpty()) return Pair(0, 0)

    var maxCount = 1
    var currentCount = 1
    var maxNumber = numbers[0]

    for (i in 1 until numbers.size) {
        if (numbers[i] == numbers[i - 1]) {
            currentCount++
        } else {
            if (currentCount > maxCount) {
                maxCount = currentCount
                maxNumber = numbers[i - 1]
            }
            currentCount = 1
        }
    }

    // Проверка последней последовательности
    if (currentCount > maxCount) {
        maxCount = currentCount
        maxNumber = numbers[numbers.size - 1]
    }

    return Pair(maxNumber, maxCount)
}

fun main() {
    val numbers = listOf(1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5)
    val result = findMaxSequence(numbers)
    println("Число: ${result.first}\nМаксимальная длина последовательности: ${result.second}")
}