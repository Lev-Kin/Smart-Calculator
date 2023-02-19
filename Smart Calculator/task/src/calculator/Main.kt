package calculator

import java.util.*

fun main() {
    Calculator().go()
}

class Calculator {
    private val variables = emptyMap<String, Int>().toMutableMap()

    fun go() {
        while (true) {
            val line = readLine()!!

            if (line.isEmpty()) continue

            if (line.startsWith("/")) {
                when (line) {
                    "/exit", "/x" -> break
                    "/help", "/h" -> {
                        println("The program is an awesome calculator!")
                        continue
                    }

                    "/v" -> {
                        println(variables)
                        continue
                    }

                    else -> {
                        println("Unknown command")
                        continue
                    }
                }
            } else {
                processInput(line)
            }
        }
        println("Bye!")
    }

    private fun processInput(line: String) {
        try {
            if (line.contains("=")) {
                assignVariable(line)
            } else {
                println(calculate(line))
            }
        } catch (e: UnknownVariableException) {
            println(e.message)
        }
    }

    private fun calculate(line: String): Int {
        val operation = Stack<String>()
        val stack = Stack<Int>()

        val symbols = line.trim().split(" ").toMutableList()
        while (symbols.isNotEmpty()) {
            var symbol = symbols.removeAt(0)

            symbol = cleanupRedundantSigns(symbol)

            if (symbol in "+-*/") {
                operation.push(symbol)
            } else {
                if (operation.isEmpty()) {
                    stack.push(getValue(symbol))
                } else {
                    when (operation.pop()) {
                        "+" -> stack.push(stack.pop() + getValue(symbol))
                        "-" -> stack.push(stack.pop() - getValue(symbol))
                        "*" -> stack.push(stack.pop() * getValue(symbol))
                        "/" -> stack.push(stack.pop() / getValue(symbol))
                        else -> throw UnknownOperatorException()
                    }
                }
            }
        }
        return stack.pop()
    }

    private fun cleanupRedundantSigns(symbol: String): String {
        return when {
            symbol.matches(Regex("(--)*")) -> "+"
            symbol.matches(Regex("-*")) -> "-"
            symbol.matches(Regex("\\+*")) -> "+"
            else -> symbol.trim()
        }
    }

    private fun assignVariable(line: String) {
        val variable = line.substringBefore("=").trim()
        if (!isValidVariableName(variable)) {
            println("Invalid identifier")
            return
        }

        val value = line.substringAfter("=").trim()
        if (!isNumber(value) && !isValidVariableName(value)) {
            println("Invalid identifier")
            return
        }

        variables[variable] = getValue(value)
    }

    private fun isValidVariableName(name: String): Boolean {
        return name.matches("[a-z]*".toRegex())
    }

    private fun isNumber(name: String): Boolean {
        return name.toIntOrNull() != null
    }

    private fun getValue(token: String): Int {
        return token.toIntOrNull() ?: variables[token] ?: throw UnknownVariableException()
    }
}

class UnknownVariableException : Exception("Unknown variable")
class UnknownOperatorException : Exception("Unknown operator")