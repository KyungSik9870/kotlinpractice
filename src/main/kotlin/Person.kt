class Person (val name: String, var age: Int) {// 주생성자, 반드시 존재. 파라미터가 없을떄는 생략가능
    init {
        if (age <= 0) {
            throw IllegalArgumentException("$age age is invalid")
        }
        println("초기화 블록")
    }

    // 부생성자. 최종적으로 주생성자를 this 로 호출해야한다. body 를 가질 수 있다.
    constructor(name:String): this(name, 1) {
        println("부생성자 내의 body")
    }

    constructor(): this("default") {
        println("두번째 부생성자 내의 body")
    }

}

