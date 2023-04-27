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

const val LOGIN_MIN_LENGTH = 4
const val PWD_MIN_LENGTH = 4
fun main() {
    var login = ""
    println("Для регистрации придумайте логин и сгенерируйте пароль")
    while (true) {
        print(" Логин: >> ")
        login = readln()
        if (checkingLengthLogin(login)) println("Слишком короткий логин, логин должен быть не менее 4 символов")
        else break
    }
    val password = pwdGenerator()
    authorization(login, password)

}

fun pwdGenerator(): String {
    val number = 0 until 10
    val sym: CharRange = ' '..'@'
    val result = mutableListOf<String>()
    for (i in 1..PWD_MIN_LENGTH) {
        result.add(number.random().toString())
        result.add(sym.random().toString())
    }
    print("Пароль: >> ")
    result.forEach { print(it) }
    return result.joinToString("")

}

fun checkingLengthLogin(login: String): Boolean {
    return login.length < LOGIN_MIN_LENGTH
}

fun authorization(loginUser: String, passwordUser: String) {
    while (true) {
        println()
        println("Авторизуйтесь")
        print(" Логин: >> ")
        val login = readln()
        print("Пароль: >> ")
        val password = readln()
        if (login != loginUser || password != passwordUser)
            println("Неверно введен логин или пароль!")
        else {
            while (true) {
                val sms = smsGenerator().toString()
                println(sms)
                print("Введите код подтверждения: >> ")
                val smsUser = readln()
                if (sms != smsUser) println("Повторите ввод кода!")
                else println("Вы успешно авторизовались!")
                break
            }
        }
        break
    }
}

fun smsGenerator(): Int {
    return (1..4).random()
}
