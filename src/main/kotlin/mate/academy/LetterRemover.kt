package mate.academy

fun main() {
    val input = "Remove Letters"
    println(LetterRemover.removeLetter(input).contentToString())
}

object LetterRemover {
    @JvmStatic
    fun removeLetter(input: String): CharArray {
        val chars = input.lowercase().toCharArray()
        val result = CharArray(chars.size)
        for (i in chars.indices) {
            if (chars[i] == 'r' || chars[i] == 'R') {
                result[i] = '!'
            } else {
                result[i] = chars[i]
            }
        }
        return result
    }
}
