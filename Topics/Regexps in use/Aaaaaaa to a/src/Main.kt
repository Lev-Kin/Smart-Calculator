fun main() {
    val text = readln()
    val result = text.replace(regex = "[aA]+".toRegex(), replacement = "a")

    println(result)
}