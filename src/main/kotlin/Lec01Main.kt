/**
 * 코틀린에서 변수를 다루는 방법
 */
fun main() {
    // 가변
    var number1 = 10L

    // 불변
    val number2 = 10L

    // 타입을 명시적으로 작성하지 않아도, 타입이 추론된다.

    // 초기값이 없으면 타입 지정해줘야함
    var number3: Int
    val number4: Long
    // Long, long -> 코틀린은 연산이 필요한 경우, 알아서 primitive type 으로 변환한다.

    // nullable 하게 하려면 type 을 지정하고, ? 키워드를 붙여준다.
    var number5: Long? = 1000L
    number5 = null;
}