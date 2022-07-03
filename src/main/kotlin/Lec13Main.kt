/**
 * 코틀린에서 중첩 클래스를 다루는 방법
 */
fun main() {

}

class JavaHouse(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    class LivingRoom(// 권장되는 클래스 안의 클래스 : java 에서의 static 클래스
        private val area: Double
    )
}