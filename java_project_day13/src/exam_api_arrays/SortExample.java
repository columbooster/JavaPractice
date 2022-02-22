package exam_api_arrays;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] array = { 9, 4, 5, 6, 2, 1 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		String[] subject = { "자바", "오라클", "스프링" };
		Arrays.sort(subject);
		printArray(subject);

		System.out.println();

		// Member 클래스는 이름/주소/나이를 필드로 가지고 있다. 나이순으로 정렬하고자 한다.
		Member m1 = new Member("홀길동", "서울시 성동구 마장동", 50);
		Member m2 = new Member("김철수", "서울시 마포구 대흥동", 35);
		Member m3 = new Member("조민희", "서울시 강남구 삼성동", 20);
		Member member[] = { m1, m2, m3 };
		Arrays.sort(member);// Arrays 클래스의 sort() 메서드로 확인
		printArray(member);
		// System.out.println(Arrays.toString(members));

	}

	// 배열의 값을 출력하기 위한 메소드 구현.
	private static void printArray(Object[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i<array.length-1) {
				System.out.print(", ");
			}
		}
	}

}
