fun main() {
    val a = readln().toBigInteger()
    val b = readln().toBigInteger()

    println(a / a.gcd(b) * b)
}