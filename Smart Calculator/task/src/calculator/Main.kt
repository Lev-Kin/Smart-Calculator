package calculator

fun main() {
    while (true) {
        val line = readln()

        if (line.isEmpty()) continue
        if (line.startsWith("/")) {
            when (line) {
                "/exit" -> break
                "/help" -> {
                    println("The program is an awesome calculator!")
                    continue
                }

                else -> {
                    println("Unknown command")
                    continue
                }
            }
        }

        val result = processInput(line)
        println(result)
    }
    println("Bye!")
}

private fun processInput(line: String): Int {
    var result = 0
    var operation = "+"
    val symbol = line.split(" ").toMutableList()

    while (symbol.isNotEmpty()) {

        var symbol = symbol.removeAt(0)

        when {
            symbol.matches(Regex("(--)*")) -> symbol = "+"
            symbol.matches(Regex("-*")) -> symbol = "-"
            symbol.matches(Regex("\\+*")) -> symbol = "+"
        }

        if (symbol in "+-") {
            operation = symbol
        } else {
            try {
                when (operation) {
                    "+" -> result += symbol.toInt()
                    "-" -> result -= symbol.toInt()
                }
            } catch (e: NumberFormatException) {
                println("Invalid expression")
            }
        }
    }
    return result
}
