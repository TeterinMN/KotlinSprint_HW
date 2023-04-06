package lesson_4

fun main () {
    val day = 4
    val hands = day % 2 == 1
    val legs = day % 2 == 0
    val spine = day % 2 == 0
    val press = day % 2 == 1

    println("""
        Упражнения для рук:    $hands
        Упражнения для ног:    $legs
        Упражнения для спины:  $spine
        Упражнения для пресса: $press
    """.trimIndent())
}