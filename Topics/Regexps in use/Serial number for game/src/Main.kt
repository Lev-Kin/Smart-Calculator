fun findSerialNumberForGame(listGames: List<String>) {
    val game = readln()
    for (gameLine in listGames) {
        val code = gameLine.split("@")
        if (game == code[0]) {
            println("Code for Xbox - ${code[1]}, for PC - ${code[2]}")
        }
    }

}
