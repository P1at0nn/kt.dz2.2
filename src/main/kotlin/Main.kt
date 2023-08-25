fun main(args: Array<String>) {
    val likes = 32


    if (likes % 10 == 1 && likes !== 11) {
        println("Понравилось $likes Человеку")
    } else println("Понравилось $likes людям")
}
