package lesson_4

fun main () {
    val day = 5
    val hands = day % 2 == 1
    val legs = day % 4 != 1
    val spine = day % 6 != 1
    val press = day % 8 == 1

    println("""
        Упражнения для рук:    $hands
        Упражнения для ног:    $legs
        Упражнения для спины:  $spine
        Упражнения для пресса: $press
    """.trimIndent())
}