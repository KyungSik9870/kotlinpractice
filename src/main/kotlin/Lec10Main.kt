/**
 * 코틀린에서 상속을 다루는 방법
 */
fun main() {

}

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {
    abstract fun move()
}

class Cat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("cat")
    }
}

class Penguin(
    species: String
) : Animal(species, 2), Swimable ,Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("penguin")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override val swimAbility: Int
        get() = TODO("Not yet implemented")

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }



}

interface Flyable {
    fun act() {
        println("fly")
    }
}

interface Swimable {

    val swimAbility: Int

    fun act() {
        println("swim")
    }
}