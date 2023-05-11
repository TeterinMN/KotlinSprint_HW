package lesson_10
/*
Задача 5 к Уроку 10.
Собери в одно целое регистрацию пользователя, проверку логина (минимум 4 символа), генерацию пароля
для него и авторизацию по коду из смс – программа должна “высылать” код из четырех цифр (случайное
число от 1000 до 9999). Пользователь будет вводить этот код. Если код введён неверно, программа вышлет новый.

Алгоритм действий:
1. Регистрация
 – пользователь придумывает логин (длина должна быть более 4 символов);
 – программа генерирует пароль и отображает его пользователю;

2. Авторизация
 – программа предлагает авторизоваться, пользователь вводит логин и пароль;
 – если данные неверны, отображается ошибка и логин и пароль запрашиваются заново;
 – если данные верны, “высылается” сгенерированный код из 4 цифр и запрашивается у пользователя;
 – если код неверен – высылается новый, если верен – появляется сообщение об успешной авторизации.

Действия в программе должны быть распределены по соответствующим методам без дублирования кода.
 */

const val LENGTH_USER_NAME = 4
const val PWD_MIN_LENGTH = 3
var userLogin = ""
var userPassword = ""

fun main() {
    userRegistration()
    userAuthorization()
    smsGenerator()
}

fun userRegistration() {
    do {
        print("Придумайте логин >> ")
        userLogin = readln()
    } while (userLogin.length < LENGTH_USER_NAME)
    val number = 0 until 10
    val sym: CharRange = ' '..'@'
    val result = mutableListOf<String>()
    for (i in 1..PWD_MIN_LENGTH) {
        result.add(number.random().toString())
        result.add(sym.random().toString())
        userPassword = result.joinToString("")
    }
    println("Ваш сгенерированный пароль: $userPassword")
    println()
}

fun userAuthorization() {
    var login: String
    var password: String
    do {
        print("АВТОРИЗАЦИЯ\nВведите логин: >> ")
        login = readln()
        print("Введите пароль: >> ")
        password = readln()
        if (userLogin != login || userPassword != password)
            println("Неверно введен логин или пароль")
    } while (userLogin != login || userPassword != password)
}

fun smsGenerator() {
    while (true) {
        val result = (1000..9999).random().toString()
        println()
        println("Подтвердите вход кодом: $result")
        print("Введите код подтверждения: >> ")
        val smsUser = readln()
        if (result != smsUser) {
            println("Повторите ввод кода!")
        } else {
            println("Вы успешно авторизовались!")
            break
        }
    }
}