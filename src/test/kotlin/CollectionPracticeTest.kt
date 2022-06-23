import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CollectionPracticeTest

@Test
fun test() {
    val practice = CollectionPractice()
    val result = practice.joinToString(listOf(1,2,3), ";", "(", ")")
    print(result)
}