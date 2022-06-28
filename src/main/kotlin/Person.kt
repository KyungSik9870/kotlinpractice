class Person (val name: String = "default", var age: Int = 1) {// 주생성자, 반드시 존재. 파라미터가 없을떄는 생략가능
    init {
        if (age <= 0) {
            throw IllegalArgumentException("$age age is invalid")
        }
    }
}

