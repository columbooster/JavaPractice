package exam_instanceof;

import java.util.Arrays;
/*
 * Arrays Ŭ������ sort()�޼ҵ�� ��� ��ü��
 * Comparable �������̽��� �����ϰ� �ִ� ��쿡�� ���񽺸� �����Ѵ�.
 * Student Ŭ������ �ۼ��ϰ� �л����� ������ �������� 
 */

@SuppressWarnings("rawtypes")
class Student implements Comparable {
	private String name; // �̸�
	private double gpa; // ����

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
		return "�̸�= " + name + " ����= " + gpa;
	}

	// Comparable�� �߻� �޼ҵ� ����
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
 * Student Ŭ������ �����ϰ� �̸�(name)�� ����(gpa)�� �ʵ�ΰ�����. �Ű������� ���� ������, ������, toString()��
 * �����Ѵ�.
 * 
 */
public class StudentSort {

	public static void main(String[] args) {
		// 5���� ���ڸ� ������������ �����Ͽ� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		int[] numbers = { 60, 88, 10, 45, 90 };
		Arrays.sort(numbers);

		for (int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println("\n");

		// 3���� �л� �������� ������������ �����Ͽ� ����ϴ� �ڵ带 �ۼ��� �ּ���.
		Student[] students = new Student[3];
		students[0] = new Student("ȫ�浿", 3.39);
		students[1] = new Student("���Ѽ�", 4.21);
		students[2] = new Student("������", 2.19);

		Arrays.sort(students);

		for (Student s : students) {
			System.out.println(s.toString());
		}

	}

}
