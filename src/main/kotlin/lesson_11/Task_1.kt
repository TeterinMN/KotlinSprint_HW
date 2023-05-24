package lesson_11

class User(
    val id: Int,
    val name: String,
    val password: String,
    val email: String,
)

fun main() {
    val userOne = User(
        id = 1,
        name = "Mikhail",
        password = "Vip01@",
        email = "Scorpio@r14-udc.ru"
    )
    val userTwo = User(
        id = 2,
        name = "Julia",
        password = "Vip02@",
        email = "Julia@r14-udc.ru"
    )
    println("ID Записи: ${userOne.id}")
    println("Имя пользователя: ${userOne.name}")
    println("E-Mail: ${userOne.email}")
    println()
    println("ID Записи: ${userTwo.id}")
    println("Имя пользователя: ${userTwo.name}")
    println("E-Mail: ${userTwo.email}")

}