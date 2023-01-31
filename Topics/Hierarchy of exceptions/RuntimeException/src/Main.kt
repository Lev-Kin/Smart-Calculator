fun main() {
    try {
        throw RuntimeException()
    } catch (e: RuntimeException) {
        println("Well")
    }
}
