fun solution(numbers: List<Int>, number: Int): MutableList<Int> {
    val num = mutableListOf<Int>()
    for (i in numbers) {
        num.add(i)
    }
    num.add(number)
    return num
}