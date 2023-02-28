fun main() {
    val a = readln().toBigInteger()
    val b = readln().toBigInteger()
    val q = a / b
    val r = a - b * q

    println("$a = $b * $q + $r")

}