fun main() {
    val report = readLine()!!
    val regex = Regex(". wrong answer.?")

    println(regex.matches(report))
}