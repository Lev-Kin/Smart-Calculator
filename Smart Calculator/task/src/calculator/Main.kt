package calculator

fun main() {
    while (true) {
        try {
            val input = readln()
            if (input.isEmpty()) continue

            val sum = input
                .split(' ')
                .sumOf {
                    it.toInt()
                }

            println(sum)

        } catch (_: Exception) {
            println("Bye!")
            break
        }
    }
}
