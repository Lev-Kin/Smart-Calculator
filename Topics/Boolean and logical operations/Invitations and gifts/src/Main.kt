fun main() {
    val invitation = readlnOrNull().toBoolean() // read other value in the same way
    val gift = readlnOrNull().toBoolean()

    println(invitation && gift)

}
