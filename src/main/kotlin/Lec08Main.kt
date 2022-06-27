/**
 * 코틀린에서 함수를 다루는 방법
 */
fun main() {
    println(max(1,3))
    repeat("A", userNewLine = false) //Builder 를 만들지 않고도, Builder 처럼 쓸 수 있다
    repeat("A", "B", "C")
    val array = arrayOf("A", "B", "C")
    repeat(*array)
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    userNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (userNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun repeat(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}

