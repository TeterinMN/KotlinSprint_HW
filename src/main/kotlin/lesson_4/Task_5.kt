package lesson_4

fun main() {
    print("Есть повреждения коробля? Введите True или False ")
    val hullDamage = readln().toBoolean()
    print("Введите численность комманды: ")
    val teams = readln().toInt()
    print("Введите количество провизии: ")
    val provisions = readln().toInt()
    print("Погода благоприятная? Введите True или False ")
    val weather = readln().toBoolean()

    if ((!hullDamage && teams >=55 && teams < 70 && provisions > 50 && weather) ||
        (teams == 70 && provisions > 50 && weather)
    ) {
        println("Корабль может отправляться")
    } else {
        println("Корабль не может отправляться")
    }
}