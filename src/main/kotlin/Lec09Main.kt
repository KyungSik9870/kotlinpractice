/**
 * 코틀린에서 클래스를 다루는 방법
 */
fun main() {
    val person = Person("name", 30)
    println(person.name)

    val person2 = Person("name1")
    println(person2.age)

    val person3 = Person()
    println(person3.name)
}