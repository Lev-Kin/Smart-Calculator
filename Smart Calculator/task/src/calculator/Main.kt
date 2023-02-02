package calculator

fun main() {
    while (true) {
        val input = readln()

        if (input == "/exit") {
            println("Bye!")
            break

        } else {

            if (input == "/help") {
                println("The program calculates the sum of numbers")

            } else {

                try {
                    if (input.isEmpty()) continue
                    val sum = input
                        .split(' ')
                        .sumOf {
                            it.toInt()
                        }
                    println(sum)

                } catch (_: Exception) {
                    break
                }
            }
        }
    }
}
