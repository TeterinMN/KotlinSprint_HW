package lesson_4
const val MIN_TEAMS = 55
const val MAX_TEAMS = 70
const val MIN_PROVISIONS = 50

fun main() {
    print("Есть повреждения коробля? Введите True или False ")
    val hullDamage = readln().toBoolean()
    print("Введите численность комманды: ")
    val teams = readln().toInt()
    print("Введите количество провизии: ")
    val provisions = readln().toInt()
    print("Погода благоприятная? Введите True или False ")
    val weather = readln().toBoolean()

    if ((!hullDamage && teams >= MIN_TEAMS && teams < MAX_TEAMS && provisions > MIN_PROVISIONS && weather) ||
        (teams == MAX_TEAMS && provisions > MIN_PROVISIONS && weather)
    ) {
        println("Корабль может отправляться")
    } else {
        println("Корабль не может отправляться")
    }
}