package exam_api_object;

public class StringTest {

	public static void main(String[] args) {
		// 문자열 인스턴스 생성방법 - 문자열 리터럴을 이용한 인스턴스 생성
		String str1 = "Java";
		String str2 = "Java";

		if (str1 == str2) {
			System.out.println("동일 객체");
		} else {
			System.out.println("서로 다른 객체");
		}

		// 문자열 인스턴스 생성방법 - String 클래스의 생성자를 이용하여 문자열 인스턴스 생성

		// 기본적으로 == 연산자와 동일한 결과 리턴 (주소값 비교)
		String strData1 = new String("Java");
		String strData2 = new String("Java");
		// 참조할 변수는 주솟값을 저장하는 변수이므로 아래 조건식은 주솟값 비교
		if (strData1 == strData2) {
			System.out.println("동일객체");
		} else {
			System.out.println("서로 다른 객체");
		}

		// 논리적 동등이란? 같은 객체이건 다른 객체이건 상관없이 객체 저장 데이터 동일
		// String클래스는 문자열을 비교하고자 equals()메소드를 오버라이딩(재정의)함
		if (strData1.equals(strData2)) {
			System.out.println("동일객체");
		} else {
			System.out.println("서로 다른 객체");
		}
	}

}
