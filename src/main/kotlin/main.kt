import java.lang.StringBuilder

fun main(args: Array<String>) {
    println("Hello World!")
    val practice = CollectionPractice()
    val list = listOf(1, 2, 3)
    println(list.joinToString())

    practice.performOperation()
    practice.performOperation()
    practice.reportOperationCount()

    val sb = StringBuilder("Kotlin.")
    sb.lastChar = '!'
    println(sb)

    val strings: List<String> = listOf("first", "second", "three");
    println(strings.last())
    val numbers: Collection<Int> = setOf(1, 4, 2)
    println(numbers.max())

    val (number, name) = 1 to "one"
    println("$number , $name")


    var number1: Long = 10L
    val number2 = 10L
    number1 = 5L


}