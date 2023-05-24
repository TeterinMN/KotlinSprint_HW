package lesson_1_10.lesson_10
/*
Задача 1 к Уроку 10
Напиши небольшую игру, в которой пользователь и компьютер по очереди бросают кости.
Побеждает выбросивший наибольшее число.
 – поочередно выводи сообщение о ходе игрока и компьютера (отображать кто бросил, какие значения на кубиках);
 – бросок костей вынеси в отдельную функцию, в которой генерируются 2 случайных числа от 1 до 6;
 – в отдельные переменные сохрани результат работы функции для игрока и компьютера;
 – после сравнения результатов, выведи соответствующее сообщение в консоль. Например:
 "Победило человечество" или "Победила машина".
 */
fun main() {
    result()
}

fun randomCast(): Int {
    return (1..6).random()
}

fun human(): Int {
    print("Бросок людей, выпали номера: ")
    val humanityOne = randomCast()
    val humanityTwo = randomCast()
    println("$humanityOne и $humanityTwo")
    Thread.sleep(2000)
    return humanityOne + humanityTwo
}

fun machine(): Int {
    print("Бросок машины, выпали номера: ")
    val machineOne = randomCast()
    val machineTwo = randomCast()
    println("$machineOne и $machineTwo")
    Thread.sleep(2000)
    return machineOne + machineTwo
}

fun result() {
    val result = if (human() > machine()) {
        println("Победило человечество")
    } else println("Победила машина")
    return result
}