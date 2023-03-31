package lesson_3

fun main() {
    val input = "D2-D4;0".split("-",";")
    val fromWhere = input[0]
    val toWhere = input[1]
    val count = input[2]
    println("""
        $fromWhere
        $toWhere
        $count
    """.trimIndent())
}