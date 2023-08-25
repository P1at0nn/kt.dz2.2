fun main(args: Array<String>) {
    val likes = 511



    if (likes % 10 == 1 && likes != 11 && likes % 100 !== 11) {
        println("Понравилось $likes Человеку")
    } else println("Понравилось $likes людям")
}
