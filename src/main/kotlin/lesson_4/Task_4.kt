package lesson_4
/*
Задача 4 к Уроку 4
Программа тренировок разбивает упражнения на несколько групп: упражнения для мышц рук, ног, спины и пресса.
Она рекомендует делать упражнения на каждую группу мышц через день. Пользователь начал занятия с рук и пресса.
Напиши программу, которая будет сообщать, какие упражнения нужно выполнить сегодня.
Предположим, что сегодня 5 день тренировок. В первый день выполнялись упражнения для рук и пресса.
Выведи сообщение для пятого дня в виде нескольких красивых ровных строк.
Вывод должен быть таким:
Упражнения для рук:       true
Упражнения для ног:       false
Упражнения для спины:  false
Упражнения для пресса: true
 – Все сообщение должно печататься в одном println();
 – При изменении значения переменной дня тренировки на 1 день вперед, вывод должен меняться.
 */

fun main() {
    val day = 5
    val isEven = day % 2 == 0

    println(
        """
        Упражнения для рук:    ${!isEven}
        Упражнения для ног:    $isEven
        Упражнения для спины:  $isEven
        Упражнения для пресса: ${!isEven}
    """.trimIndent()
    )
}