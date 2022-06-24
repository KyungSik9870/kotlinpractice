import org.jetbrains.annotations.NotNull;

public class Person {

	private final String name;
	private final Integer age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@NotNull
	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
}
