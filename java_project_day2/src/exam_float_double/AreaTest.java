package exam_float_double;

// 원의 반지름(radius)을 임의로 설정하고 원의 넓이와 원의 둘레를 구해서 출력해보자.

public class AreaTest {

	public static void main(String[] args) {
		double radius, area, cir;
		final double PI = 3.14; // final 변수명은 대문자로!!! pi (x) -> PI
		radius = 5.0;
		
		area = PI * radius * radius;
		cir = 2 * PI * radius;
		
		System.out.println("원의 면적은 = " + area);
		System.out.println("원의 둘레는 = " + cir);
		
		//출력 방법(원의 면적과 원의 둘레의 값을 소숫점 2자리로..)
		System.out.printf("원의 면적 : %.2f 원의 둘레 : %.2f", area, cir);
		

	}

}
