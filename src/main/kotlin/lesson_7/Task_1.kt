package lesson_7

fun main() {
    val number1: IntRange = 1..10
    val symbol1: CharRange = 'a'..'z'
    val number2: IntRange = 1..10
    val symbol2: CharRange = 'a'..'z'
    val number3: IntRange = 1..10
    val symbol3: CharRange = 'a'..'z'

    val n1 = number1.random()
    val s1 = symbol1.random()
    val n2 = number2.random()
    val s2 = symbol2.random()
    val n3 = number3.random()
    val s3 = symbol3.random()

    print("$n1$s1$n2$s2$n3$s3")
}