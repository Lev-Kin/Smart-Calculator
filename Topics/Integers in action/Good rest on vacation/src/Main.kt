fun main() {
    val days = readln().toInt()
    val foodDay = readln().toInt()
    val flyOneWay = readln().toInt()
    val hotelOneDay = readln().toInt()

    val d = foodDay * days
    val a = flyOneWay * 2
    val y = hotelOneDay * (days - 1)
    println(d + a + y)

}