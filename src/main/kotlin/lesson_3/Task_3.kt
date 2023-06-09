package lesson_3
/*
Задача 3 к Уроку 3
Пишем программу, которая будет помогать учить таблицу умножения. В отдельную переменную будет записываться
число (объявить и проинициализировать), а выводиться будет таблица умножения для этого числа.
Таблица должна корректно печататься, если в исходную переменную подставлять разные числа.
Пример вывода:
6 x 1 = 6
6 x 2 = 12
…
6 x 9 = 54
 – Вместо числа 6 использовать данные из объявленной переменной;
 – Вычислять значения прямо в строке;
 – Вывод всей таблицы нужно сделать в одной функции println(), которая вызывается один раз.
 */

fun main() {
    val x = 9
    println(
        """
        $x x 1 = ${x * 1}
        $x x 2 = ${x * 2}
        $x x 3 = ${x * 3}
        $x x 4 = ${x * 4}
        $x x 5 = ${x * 5}
        $x x 6 = ${x * 6}
        $x x 7 = ${x * 7}
        $x x 8 = ${x * 8}
        $x x 9 = ${x * 9}
        $x x 10 = ${x * 10}
    """.trimIndent()
    )
}