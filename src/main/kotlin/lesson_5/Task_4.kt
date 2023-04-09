package lesson_5

const val LOGIN = "batman"
const val PWD = "password"
fun main() {
    print("Добро пожаловать в приложение. \nВведите логин: ")
    if (readln() == LOGIN) {
        print("Введите пароль: ")
        if (readln() == PWD) println("Доступ предоставлен!")
        else println("Вы ввели неверный пароль!")
    } else println("Нет такого пользователя!")
}