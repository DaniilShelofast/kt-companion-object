package mate.academy

fun main() {
    val input = "Remove Letters"
    println(LetterRemover.removeLetter(input).contentToString())
}

class LetterRemover {
    companion object {
        @JvmStatic
        fun removeLetter(input: String): CharArray = input
            .lowercase()
            .replace('r', '!', true)
            .toCharArray()
    }
}
