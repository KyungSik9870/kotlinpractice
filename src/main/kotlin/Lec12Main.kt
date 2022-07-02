/**
 * 코틀린에서 object 키워드를 다루는 방법
 */
fun main() {
    val person2 = Person2.newBaby("name")
    println(Singleton.a)

    // 익명클래스
    // java -> new 타입이름()
    // kotlin -> object : 타입이름()
    moveSomething(object : Movable {
        override fun move() {
            println("move")
        }

        override fun fly() {
            println("fly")
        }

    })
}

class Person2 private constructor(
    var name: String,
    var age: Int
) {
    companion object Factory: Log {// 클래스와 동행하는 유일한 오브젝트, 자바의 정적 팩토리 메서드와 같은 역할
        // 하나의 객체로 인식. 이름붙이기 가능, 인터페이스 구현 가능
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("log interface 구현")
        }
    }

}

interface Log {
    fun log()
}

object Singleton {// 싱글톤은 object 키워드만 쓰면 된다.
    var a: Int = 0
}

interface Movable {
    fun move()
    fun fly()
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}