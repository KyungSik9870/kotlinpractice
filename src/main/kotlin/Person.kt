class Person (val name: String = "default", var age: Int = 1) {// 주생성자, 반드시 존재. 파라미터가 없을떄는 생략가능
    init {
        if (age <= 0) {
            throw IllegalArgumentException("$age age is invalid")
        }
    }

    // 함수로 만드는 것도 가능. 프로퍼티처럼 만들 수 있다
    val isAdult: Boolean
        get() = this.age >= 20

    val uppercaseName: String
        get() = this.name.toUpperCase()
}

