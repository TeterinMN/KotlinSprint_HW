package lesson_7

fun main() {
    print("Введите длину пароля: >> ")
    val passwordLength = readln().toInt()
    val numbers: IntRange = 1..10
    val symbolLowercase: CharRange = 'a'..'z'
    val symbolCapital: CharRange = 'A'..'Z'
    val all = numbers + symbolLowercase + symbolCapital
    
    for (i in 0 until passwordLength) {
        val random = all.random()
        print(random)
    }
}