package exam_instanceof;

import java.util.Arrays;
/*
 * Arrays 클래스의 sort()메소드는 대상 객체가
 * Comparable 인터페이스를 구현하고 있는 경우에만 서비스를 제공한다.
 * Student 클래스를 작성하고 학생들의 평점을 기준으로 
 */

@SuppressWarnings("rawtypes")
class Student implements Comparable {
	private String name; // 이름
	private double gpa; // 평점

	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "이름= " + name + " 평점= " + gpa;
	}

	// Comparable의 추상 메소드 구현
	@Override
	public int compareTo(Object obj) {
		Student other = (Student) obj;
		/*if (this.gpa < other.gpa)
			return -1;
		else if (this.gpa > other.gpa)
			return 1;
		else
			return 0;*/
		return this.name.compareTo(other.name);
	}

}

/*
 * Student 클래스를 생성하고 이름(name)과 평점(gpa)을 필드로가진다. 매개변수를 가진 생성자, 접근자, toString()을
 * 생성한다.
 * 
 */
public class StudentSort {

	public static void main(String[] args) {
		// 5개의 숫자를 오름차순으로 정렬하여 출력하는 코드를 작성하시오.
		int[] numbers = { 60, 88, 10, 45, 90 };
		Arrays.sort(numbers);

		for (int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println("\n");

		// 3명의 학생 평점으로 오름차순으로 정렬하여 출력하는 코드를 작성해 주세요.
		Student[] students = new Student[3];
		students[0] = new Student("홍길동", 3.39);
		students[1] = new Student("이한솔", 4.21);
		students[2] = new Student("김희진", 2.19);

		Arrays.sort(students);

		for (Student s : students) {
			System.out.println(s.toString());
		}

	}

}
