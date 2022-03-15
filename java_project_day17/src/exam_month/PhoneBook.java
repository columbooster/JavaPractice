package exam_month;

import java.util.Scanner;

// 객체 배열 복습

class Phone {
	private String name; // 필드
	private String tel;

	public Phone(String name, String tel) { // 생성자
		this.name = name;
		this.tel = tel;
	}

	public String getName() { // 접근자
		return name;
	}

	public String getTel() {
		return tel;
	}

}

public class PhoneBook {

	private Phone[] pArray;
	private Scanner sc;

	public PhoneBook() {
		sc = new Scanner(System.in);
	}

	private void read() {
		System.out.print("인원수 >> ");
		int n = sc.nextInt();

		pArray = new Phone[n]; // 인원수 n 명을 저장할 배열 선언
		for (int i = 0; i < pArray.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) >> ");
			String name = sc.next();
			String tel = sc.next();
			pArray[i] = new Phone(name, tel);
		}

		System.out.println("저장 되었습니다...");
	}

	private String search(String name) {
		for (int i = 0; i < pArray.length; i++) {
			if (pArray[i].getName().equals(name))
				return pArray[i].getTel();
		}
		return null; // 존재하지 않으면 null 값 반환
	}

	public void run() {
		read();
		while (true) {
			System.out.print("검색할 이름 >> ");
			String name = sc.next();
			if (name.equals("그만"))
				break;
			String tel = search(name);
			if (tel == null)
				System.out.println(name + "는(은) 없습니다.");
			else
				System.out.println(name + "의 번호는 " + tel + " 입니다.");
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

	public static void main(String[] args) {
		new PhoneBook().run();
	}

}
