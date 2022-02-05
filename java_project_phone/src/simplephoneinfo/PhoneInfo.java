package simplephoneinfo;

public class PhoneInfo {
	
	private String name;
	private String phoneNumber;
	private String birthday;
	
	
	public PhoneInfo() {// default »ý¼ºÀÚ
		
	}
	
	public PhoneInfo(String name, String phoneNumber) {
		
		this(name, phoneNumber, null);
		
	}
	
	public PhoneInfo(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	

	
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
	
	

	public void showPhoneInfo() {
		System.out.println("name : " + name);
		System.out.println("honeNumber : " + phoneNumber);
		
		if(birthday != null) {
			System.out.println("birth : " + birthday);
		}
		
		System.out.println();
	}
	

	
}
