package lesson_3

fun main() {
    var count = "1"
    var fromWhere = "E2"
    var toWhere = "E4"
    val resultOne = "$fromWhere-$toWhere; $count"

    count = "2"
    fromWhere = "D2"
    toWhere = "D3"
    val resultTwo = "$fromWhere-$toWhere; $count"

    println("$resultOne\n$resultTwo")
}