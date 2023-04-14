package lesson_4
/*
Задача 2 к Уроку 4
На таможенном терминале грузы сортируют по весу и объему. Напиши программу, которая определяет – подходит
ли груз в категорию Average. Параметры категории неизменны: вес от 35 кг до 100 кг включительно,
объем до 100 л не включительно.
Программа должна выводить в консоль информацию.
Пример вывода: “Average для груза с весом 42 кг и объемом 120 л: false”
– проинициализировать заранее известные ограничения;
– определить подходят ли под категорию Average грузы со следующими параметрами: 20кг / 80л и 50кг / 100л;
– выполнять сравнение сразу внутри println() и без использования диапазонов.
 */

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100
    val firstCargoWeight = 20
    val firstCargoVolume = 80
    val secondCargoWeight = 50
    val secondCargoVolume = 100
    println(
        "Average для груза с весом $firstCargoWeight кг и объемом $firstCargoVolume л: " +
                "${firstCargoWeight >= minWeight && firstCargoWeight <= maxWeight && firstCargoVolume < maxVolume}"
    )
    println(
        "Average для груза с весом $secondCargoWeight кг и объемом $secondCargoVolume л: " +
                "${secondCargoWeight >= minWeight && secondCargoWeight <= maxWeight && secondCargoVolume < maxVolume}"
    )

}