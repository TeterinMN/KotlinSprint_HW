package lesson_6

fun main() {
    print("Для регистрации введите логин: >> ")
    val userLogin = readln()
    print("Придумайте пароль: >> ")
    val userPwd = readln()
    while (true) {
        println()
        print("Для входа введите логин: ")
        val enteredLogin = readln()
        print("Введите пароль: ")
        val enteredPassword = readln()
        if (enteredLogin == userLogin && enteredPassword == userPwd) {
            println()
            println("Авторизация прошла успешно")
            break
        } else {
            println("Неверный логин или пароль повторите попытку")
        }
    }
}