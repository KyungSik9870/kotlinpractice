/**
 * 코틀린에서 다양한 클래스를 다루는 방법
 */
fun main() {
    val dto = PersonDto("name", 19)
    println(dto)
}

data class PersonDto(
    val name: String,
    val age: Int
)

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
}