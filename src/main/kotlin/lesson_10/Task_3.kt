package lesson_10
/*
Задача 3 к Уроку 10.
Напиши программу, которая генерирует пароли. Пароль должен состоять из
чередующихся цифр и специальных символов. Например, #5%6”2.
 – пользователь сам задает длину пароля;
 – для генерации пароля должна быть отдельная функция, принимающая целочисленное
 значение длины пароля и возвращающая готовый пароль;
 – пароль должен содержать цифры от 0 до 9, специальные символы: !"#$%&'()*+,-./ и
 пробел (всего 16 спецсимволов).
 */

fun main() {
    print("Программа генерации пароля. Введите длину пароля в цифрах: >> ")
    val quantity = readln().toInt()
    passwordGenerator(quantity)

}

fun passwordGenerator(length: Int) {
    var temp: Int
    val number = 0 until 10
    val sym: CharRange = ' ' .. '@'
    val result = mutableListOf<String>()
    for (i in 1..length / 2) {
        result.add(number.random().toString())
        result.add(sym.random().toString())
    }
    print("Ваш пароль: ")
    result.forEach { print(it) }
}