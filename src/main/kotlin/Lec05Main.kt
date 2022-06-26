/**
 * 코틀린에서 제어문을 다루는 방법
 */
fun main() {
   // 코틀린에서 if else 는 expression
    println(getGradeWithIf(55))
    println(getGradeWithSwitch(70))
    println(startsWithA("Abc"))
    println(judgeNumber(1))
    println(judgeNumber2(10))
}

fun getGradeWithIf(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGradeWithSwitch(score: Int) : String {
    // 조건부에는 어떤 expression 도 들어갈 수 있다.
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("많이 본 숫자")
        else -> println()
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("입력 숫자는 0")
        number % 2 == 0 -> println("입력 숫자는 짝수")
        else -> println("입력 숫자는 홀수")
    }
}