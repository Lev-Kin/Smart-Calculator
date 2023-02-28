import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val arr = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val list = arr.toList()
    Collections.rotate(list, scanner.nextInt())
    println(list.toIntArray().joinToString(" "))
}

