package lesson_7

fun main() {
    val number1: IntRange = 1 until 10
    val symbol1: CharRange = 'a'..'z'
    val number2: IntRange = 1 until  10
    val symbol2: CharRange = 'a'..'z'
    val number3: IntRange = 1 until  10
    val symbol3: CharRange = 'a'..'z'

    print("${number1.random()}${symbol1.random()}" +
            "${number2.random()}${symbol2.random()}" +
            "${number3.random()}${symbol3.random()}")
}