package lesson_4

fun main(){
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100
    val firstCargoWeight = 20
    val firstCargoVolume = 80
    val secondCargoWeight = 50
    val secondCargoVolume = 100
    println("Average для груза с весом $firstCargoWeight кг и объемом $firstCargoVolume л: " +
            "${firstCargoWeight >= minWeight && firstCargoWeight <= maxWeight && firstCargoVolume < maxVolume}")
    println("Average для груза с весом $secondCargoWeight кг и объемом $secondCargoVolume л: " +
            "${secondCargoWeight >= minWeight && secondCargoWeight <= maxWeight && secondCargoVolume < maxVolume}")

}