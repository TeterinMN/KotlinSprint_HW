package lesson_6

fun main() {
    var appRunning = true
    var login = ""
    var password = ""

    while (appRunning) {
        println()
        print(
            """
            Зарегистрироваться  - 1
            Войти в систему     - 2
            Выйти из приложения - 3
            Выберите действие:  >> 
        """.trimIndent()
        )

        when (readln().toInt()) {
            1 -> {
                while (true) {
                    println()
                    print("Введите логин: ")
                    login = readln()
                    break
                }
                while (true) {
                    print("Введите пароль: ")
                    password = readln()
                    break
                }
                println("Регистрация прошла успешно")
            }

            2 -> {
                while (true) {
                    println()
                    print("Введите логин: ")
                    val enteredLogin = readln()
                    print("Введите пароль: ")
                    val enteredPassword = readln()
                    if (enteredLogin == login && enteredPassword == password) {
                        println()
                        println("Авторизация прошла успешно")
                        break
                    } else {
                        println()
                        println("Неверный логин или пароль")
                    }
                }
            }

            3 -> {
                println()
                println("Выход из приложения")
                appRunning = false
            }

            else -> {
                println()
                println("Ошибка. Выберите пункт от 1 до 3")
            }
        }
    }
}