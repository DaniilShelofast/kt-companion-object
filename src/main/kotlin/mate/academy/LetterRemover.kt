package mate.academy

fun main() {
    val input = "Remove Letters"
    println(LetterRemover.removeLetter(input).contentToString())
}

object LetterRemover {
    @JvmStatic
    fun removeLetter(input: String): CharArray = input
        .lowercase()
        .replace('r', '!')
        .toCharArray()
}
