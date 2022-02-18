package exam_api_object;

/*아이디와 나이를 필드로 가진 Member클래스를 생성한다.
 * 각각의 객체를 생성하여 나이가 같으면 두 객체는 "동등합니다."
 * 또는 나이가 다르면 두 객체는 "동등하지 않습니다"라고 출력할수있도록
 * 실행클래스를 작성해주세요.
 * 
 */

public class MemberExample {

	public static void main(String[] args) {

		Member m1 = new Member("blue1234", 25);
		Member m2 = new Member("blue1234", 27);
		Member m3 = new Member("red1234", 25);

		// 객체의 참조값 비교
		System.out.println("m1==m2 = " + (m1 == m2));

		//m3 = m1;
		System.out.println("m1==m3 = " + (m1 == m3));

		// equals() 메서드 재정의 후 다시 확인.
		if (m1.equals(m2)) {
			System.out.println("m1과m2는 동등합니다.");
		} else {
			System.out.println("m1과m2는 동등하지않습니다.");
		}

		if (m1.equals(m3)) {
			System.out.println("m1과m3는 동등합니다.");
		} else {
			System.out.println("m1과m3는 동등하지않습니다.");
		}

	}

}
