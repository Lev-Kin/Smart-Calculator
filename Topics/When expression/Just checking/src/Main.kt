fun main() {

    val result = when (readln().toInt()) {
        1 -> "Java"
        2 -> "Kotlin"
        3 -> "Scala"
        4 -> "Python"
        else -> "Unknown number"
    }

    if (result == "Kotlin") {
        println("Yes!")
    } else if (result == "Unknown number") {
        println("Unknown number")
    } else {
        println("No!")
    }

}