package exam_class_array;

class Phone {
	private String name; // 핸드폰명
	private String comp; // 제조사명
	
	public Phone() { //디폴트 생성자 (매개변수를 가지고 있지 않은 생성자)
		
	}
	
	public Phone(String name, String comp) { // 생성자(매개변수를 가지고 있는 생성자)
		this.name = name;
		this.comp = comp;
	}
	
	public void printData() { // 필드값 출력 메소드
		//System.out.println("핸드폰명:" + name + "제조사명" + comp);
		System.out.printf("핸드폰명:%10s\t제조사명:%s\n",name,comp);
	}
	
	
}


public class PhoneObjectArray {

	public static void main(String[] args) {
		
		//참조변수로 표현
		Phone p1,p2,p3; // 객체 선언(참조변수 선언)
		p1 = new Phone("아이폰12","애플"); // 객체 생성(인스턴스 생성)
		p2 = new Phone("갤럭시 s21", "삼성");
		p3 = new Phone("갤럭시 노트 20","삼성");
		
		p1.printData();
		p2.printData();
		p3.printData();
		
		// 객체배열과 표현
		Phone[] p = new Phone[3];
		
		p[0] = new Phone("아이폰12","애플");
		p[1] = new Phone("갤럭시 s21", "삼성");
		p[2] = new Phone("갤럭시 노트 20","삼성");
		
		//출력구문
		for(int i = 0; i<p.length; i++) {
			p[i].printData();
		}
		System.out.println();
		
		// for~each 출력구문    for (자료형 변수명 : 배열명){}
		for (Phone ph : p) { //Phone ph = p[0]
			ph.printData();
		}
		System.out.println();
		
		//객체배열의 초기화로 표현
		Phone[] ph = new Phone[] {
				new Phone("아이폰12","애플"), // ph[0]
				new Phone("갤럭시 s21", "삼성"), //ph[1]
				new Phone("갤럭시 노트 20","삼성") //ph[2]
				}; 
		
		//출력구문
		for(int i = 0; i<ph.length; i++) {
			ph[i].printData();
		}
		
		
		
	}

}
