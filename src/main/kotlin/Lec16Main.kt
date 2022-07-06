/**
 * 코틀린에서 다양한 함수를 다루는 방법
 */
fun main() {
    val str: String = "ABC"
    println(str.lastChar())
}

// 확장함수
fun String.lastChar(): Char {
    return this[this.length - 1]
}

// infix, inline 이 있음
// infix 는 3 add 4 와 같은 형식으로 사용
// inline 은 함수본문이 호출위치로 이동. 함수 call 을 줄일 수 있지만 성능측정과 같이 사용해야함