package exam_class_static;

public class Dog {
	
	private String name;
	private String breed;
	private int age;
	
	public Dog(String name, int age) {
		this(name, null, age);
	}
	
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return String.format("나의 반려견[이름 : %s, 종류 : %s, 나이 : %d]", name, breed, age);
	}
	

}
