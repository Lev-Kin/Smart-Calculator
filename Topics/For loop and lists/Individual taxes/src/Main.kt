import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numCompanies = scanner.nextInt()
    val income = (0 until numCompanies).map { scanner.nextInt() }.toIntArray()
    val taxes = (0 until numCompanies).map { scanner.nextInt() }.toIntArray()
    val (maxCompany, _) = taxes.foldIndexed(Pair(0, 0)) { index, acc, taxPercentage ->
        val taxPaid = taxPercentage * income[index]
        if (taxPaid > acc.second) {
            Pair(index + 1, taxPaid)
        } else {
            acc
        }
    }
    println(maxCompany)
}