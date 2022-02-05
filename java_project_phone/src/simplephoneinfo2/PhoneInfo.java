package simplephoneinfo2;

public class PhoneInfo {
	//필드작성
	private String name; // 이름
	private String phoneNumber; //전화번호
	private String birthday; //생년원일
	
	public PhoneInfo() { // 기본생성자 (생략가능)
		
	}
	
	
	// getter/setter 접근자/설정자  alt+shift+s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public void showPhoneInfo() { // 출력 메소드
		System.out.println("입력된정보 출력...");
		System.out.println("name: "+name+"\nphone: "+phoneNumber+"\nbirth: "+birthday);
		System.out.println();
	}
	
	
	

}
