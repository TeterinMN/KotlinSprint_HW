package lesson_7

fun main() {
    val number: IntRange = 1..10
    val symbol: CharRange = 'a'..'z'
    
    for (i in 1..3) {
        print(number.random())
        print(symbol.random())
    }
}