package calculator

fun main() {
    while (true) {
        val line = readln()

        if (line.isEmpty()) continue
        if (line == "/exit") break
        if (line == "/help") {
            println("The program calculates the sum of numbers")
            continue
        }

        var sum = 0
        var operation = "+"

        val symbols = line.split(" ").toMutableList()
        while (symbols.isNotEmpty()) {
            var symbol = symbols.removeAt(0)

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
                        "+" -> sum += symbol.toInt()
                        "-" -> sum -= symbol.toInt()
                    }
                } catch (e: NumberFormatException) {
                    println("$symbol is not a valid number!")
                }
            }
        }

        println(sum)
    }
    println("Bye!")
}

