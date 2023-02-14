fun main() {
    val n = readln().toInt()
    val mutList: MutableList<Int> = mutableListOf()
    for (i in 0 until n) {
        mutList.add(readln().toInt())
    }

    val m = readln().toInt()
    var result = false
    for (i in 0 until n) {
        if (mutList[i] == m) {
            result = true
            break
        }
    }

    if (result) {
        println("YES")
    } else {
        println("NO")
    }
}
