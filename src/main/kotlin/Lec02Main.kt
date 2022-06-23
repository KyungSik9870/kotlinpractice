/**
 * 코틀린에서 null 을 다루는 방법
 */
fun main() {
    val str: String? = "ABC"
    // safety call : null 이 아니면 실행하고,
    // null 이면 실행하지 않는다. (그대로 null)
    println(str?.length)
    // elvis 연산자 : 앞의 연산 결과가 null 이면 뒤의 값을 사용
    println(str?.length ?: 0)
}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null")
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}