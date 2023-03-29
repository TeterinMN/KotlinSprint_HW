package lesson_2

fun main() {
    val workers = 50
    val interns = 30
    val salaryWorkers = 30_000
    val salaryInterns = 20_000
    val resultSalaryWorkers = workers * salaryWorkers
    val resultSalaryInterns = interns * salaryInterns
    val resultSalary = resultSalaryWorkers + resultSalaryInterns
    val average = resultSalary / (workers + interns)

    println(
        """
        $resultSalaryWorkers
        $resultSalary
        $average
    """.trimIndent()
    )

}