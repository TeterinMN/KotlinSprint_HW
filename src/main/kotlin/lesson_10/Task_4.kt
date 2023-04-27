package lesson_10
/*
Задача 4 к Уроку 10.
Усовершенствуй игру, где пользователь и компьютер по очереди бросают кости. Побеждает выбросивший наибольшее число.
Теперь дай возможность пользователю играть до тех пор, пока ему не надоест. В конце программа должна вывести
сколько партий он выиграл.
 – логика бросков должна быть реализована по примеру из задачи 1;
 – после первого раунда программа задает вопрос: “Хотите бросить кости еще раз? Введите Да или Нет”;
 – программа в зависимости от ответа запускает новый раунд или заканчивает игру с выводом количества
 выигрышных партий человека;
 – в программе должно быть минимум 2 метода (для проведения раунда и для генерации значений брошенных кубиков).
 */

fun main() {
    var count = 0
    while (true) {
        print("Бросок человека, выпало  - ")
        val human = round()
        print("Бросок компьютера, выпало - ")
        val machine = round()
        if (human > machine) count++
        resultRound(human, machine)
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val answer = readln()
        if (answer == "да") {
            println("Продолжаем игру")
        } else {
            println("Человек победил $count раз")
            break
        }
    }
}

fun randomValue(): Int {
    return (1..6).random()
}

fun round(): Int {
    val diceOne = randomValue()
    val diceTwo = randomValue()
    println("$diceOne и $diceTwo = ${diceOne + diceTwo}")
    Thread.sleep(1000)
    return diceOne + diceTwo
}

fun resultRound(human: Int, machine: Int) {
    return if (human > machine) println("Победил человек")
    else if (human == machine) println("Победила дружба")
    else println("Победил компьютер")
}