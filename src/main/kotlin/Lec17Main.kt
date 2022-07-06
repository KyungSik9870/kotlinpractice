/**
 * 코틀린에서 람다를 다루는 방법
 */
fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1500),
        Fruit("사과", 2000),
        Fruit("사과", 3000),
        Fruit("바나나", 3500),
        Fruit("바나나", 5000),
        Fruit("바나나", 6000)
    )

    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2 = {fruit: Fruit -> fruit.name == "사과"}

    filterFruits(fruits, isApple)
    filterFruits(fruits, isApple2)
    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" }
    filterFruits(fruits) {it.name == "사과"}
}

fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}

class Fruit(val name: String, val price: Int)