import java.lang.StringBuilder

class CollectionPractice {

    private var opCount = 0

    fun performOperation() {
        opCount++
    }

    fun reportOperationCount() {
        println("Operation $opCount")
    }

}

fun <T> Collection<T>.joinToString(
    separator: String = "-",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix);
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }