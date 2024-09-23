package Lab6

fun main() {
    val array = intArrayOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3)
    val median = calculateMedian(array)
    println("Медиана: $median")
}

fun calculateMedian(array: IntArray): Double {
    val sortedArray = array.sorted()
    val size = sortedArray.size

    return if (size % 2 == 0) {
        (sortedArray[size / 2 - 1] + sortedArray[size / 2]) / 2.0
    } else {
        sortedArray[size / 2].toDouble()
    }
}