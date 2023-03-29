package lesson_2

fun main(){
    val crystalOre = 7
    val ironOre = 11
    val bonus = 20

    val bonusCrystalOre = crystalOre * bonus / 100
    val bonusIronOre = ironOre * bonus / 100

    println("Количество бонусной кристаллической руды: $bonusCrystalOre")
    println("Количество бонусной железной руды: $bonusIronOre")
}