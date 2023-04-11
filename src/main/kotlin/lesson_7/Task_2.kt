package lesson_7

fun main() {
    val code: IntRange = 1000 until 10000
    
    while (true) {
        val userCode = code.random()
        println("Ваш код авторизации: $userCode")
        print("Введите код: >> ")
        val answer = readln().toInt()
        if (answer == userCode) {
            println("Вы успешно авторизовались!")
            break
        } else continue
    }
}