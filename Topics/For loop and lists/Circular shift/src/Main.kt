fun main() {
    val size = readln().toInt()
    val list = MutableList(size) { readln().toInt() }

    list.add(0, list[list.lastIndex])
    list.removeAt(size)

    print(list.joinToString(" "))
}