package lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70_000
    val mortgageRate = 16.7

    val result = deposit * (1 + mortgageRate / 100).pow(20)
    println(result)
}