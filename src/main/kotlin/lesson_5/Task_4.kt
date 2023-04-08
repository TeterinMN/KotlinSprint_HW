package lesson_5

fun main() {
    print("Добро пожаловать в приложение. \nВведите логин: ")
    val login = readln()
    if (login == "batman") {
        print("Введите пароль: ")
        val password = readln()
        if (password == "password") println("Доступ предоставлен!")
        else println("Вы ввели неверный пароль!")
    } else println("Нет такого пользователя!")
}