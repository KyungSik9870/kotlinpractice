/**
 * 코틀린에서 반복문을 다루는 방법
 */
fun main() {
    for (i in 1..3) {
        println(i)
    }

    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2){
        println(i)
    }


}