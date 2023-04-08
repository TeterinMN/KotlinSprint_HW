package lesson_5

const val LOGIN = "batman"
const val PWD = "password"
fun main() {
    print("Добро пожаловать в приложение. \nВведите логин: ")
    val login = readln()
    if (login == LOGIN) {
        print("Введите пароль: ")
        val pwd = readln()
        if (pwd == PWD) println("Доступ предоставлен!")
        else println("Вы ввели неверный пароль!")
    } else println("Нет такого пользователя!")
}