/**
 * 코틀린에서 type 을 다루는 방법
 */
fun main() {
    // java 는 큰 타입으로 암시적 변경이 되지만, 코틀린에서는 안된다.
    val number1 = 3
    val number2: Long = number1.toLong()

//    printAgeIfPerson(null)
    printAgeIfPerson(Person("", 100))

    // value is Type -> value = type -> true
    //               -> value != type -> false

    // value as Type -> value = type -> type 으로 타입캐스팅
    //               -> value != type -> exception

    // value as? Type -> value = type -> type 으로 타입캐스팅
    //                -> value = null -> null
    //                -> value != type -> null
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}