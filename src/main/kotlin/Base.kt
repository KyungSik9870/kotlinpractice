fun main() {
    Derived(300)
}

open class Base(
    open val number: Int = 100
) {
    init {
        println("Base")
        // 하위 클래스에서 오버라이드 하고 있는 final 이 아닌 프로퍼티에 접근하면 안된다
        // 상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야 한다.
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived")
        println(number)
    }
}