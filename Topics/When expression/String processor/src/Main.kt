fun main() {
    val a = readln()
    val b = readln()
    val c = readln()
    when (b) {
        "equals" -> println(a == c)
        "plus" -> println(a + c)
        "endsWith" -> println((a.endsWith(c)).toString())
        else -> print("Unknown operation")
    }
}