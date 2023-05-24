package lesson_1_10.lesson_7
/*
Задача 5 к Уроку 7
Создай программу, которая генерирует более сложные пароли.
 – пароль должен содержать цифры, строчные и заглавные буквы;
 – цифры и буквы должны располагаться в случайном порядке;
 – длина пароля должна задаваться пользователем.
 */

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