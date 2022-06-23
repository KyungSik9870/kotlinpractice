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

    val person = Person("name")
    // nullable 인지 아닌지 모른다면 그것을 '플랫폼 타입' 이라 한다.
    // 이 떄는 런타임시 NPE 가 발생할 수 있다.
    println(startsWithA(person.name))
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
    // 이 변수는 Null 이 아니다. NPE 발생 가능
    return str!!.startsWith("A")
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}