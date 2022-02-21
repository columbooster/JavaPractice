package exam_api_stringbuffer;

public class StringBufferExample {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("This");

		sb.append(" is pencil"); // 문자열 덧붙이기
		System.out.println(sb);

		sb.insert(7, " my"); // 문자열 삽입
		System.out.println(sb);

		sb.replace(8, 10, "your"); // "my"를 "your"로 변경
		System.out.println(sb);

		sb.delete(8, 13); // "your"삭제
		System.out.println(sb);

		sb.setLength(4); // 스트링버퍼 내 문자열 길이 수정 setxx() : 생성자 getxx() : 접근자 toxx() : 변환  isxx() : 여부 판단(boolean) 
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		sb.delete(0, sb.length());	
		System.out.println(sb.toString().isEmpty());
		
		
		
		StringBuilder sd = new StringBuilder("This");

		sd.append(" is pencil"); // 문자열 덧붙이기
		System.out.println(sd);

		sd.insert(7, " my"); // 문자열 삽입
		System.out.println(sd);

		sd.replace(8, 10, "your"); // "my"를 "your"로 변경
		System.out.println(sd);

		sd.delete(8, 13); // "your"삭제
		System.out.println(sd);

		sd.setLength(4); // 스트링버퍼 내 문자열 길이 수정 setxx() : 생성자 getxx() : 접근자 toxx() : 변환  isxx() : 여부 판단(boolean) 
		System.out.println(sd);

		sd.reverse();
		System.out.println(sd);

		sd.delete(0, sd.length());	
		System.out.println(sd.toString().isEmpty());
		
		

	}

}
