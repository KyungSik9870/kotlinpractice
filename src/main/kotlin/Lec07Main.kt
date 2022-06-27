/**
 * 코틀린에서 예외를 다루는 방법
 */
fun main() {
    val filePrinter: FilePrinter = FilePrinter()
    filePrinter.readFile()
}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("not number")
    }
}

fun parseIntOrThrow2(str: String): Int? {
    return try { // try catch 도 expression 으로 간주함.
        str.toInt()
    } catch (e: java.lang.NumberFormatException) {
        null
    }
}

