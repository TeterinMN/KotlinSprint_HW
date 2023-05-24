package lesson_1_10.lesson_10
/*
Задача 2 к Уроку 10
Для регистрации в приложении пользователь придумывает логин и пароль. И пароль, и логин должны содержать в себе
хотя бы 4 символа. Если всё верно, программа выводит приветственное сообщение.
 – логин и пароль должны считываться с консоли;
 – проверку длины логина или пароля вынеси в отдельную функцию, которая валидирует длину пароля;
 – если пароль меньше 4 символов – вывести сообщение: "Логин или пароль недостаточно длинные".
 */

const val MIN_LENGTH = 4
fun main() {
    println("Для регистрации придумайте логин и пароль, не менее 4 символов")
    print("Логин: ")
    val userLogin = readln()
    print("Пароль: ")
    val userPassword = readln()
    if (checkingLengthPasswordLogin(userLogin, userPassword))
        println("Логин или пароль недостаточно длинные")
    else println("Добро пожаловать!")
}

fun checkingLengthPasswordLogin(login: String, password: String): Boolean {
    return  login.length < MIN_LENGTH || password.length < MIN_LENGTH
}