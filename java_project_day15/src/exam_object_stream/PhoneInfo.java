package exam_object_stream;

import java.io.Serializable;

public class PhoneInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String phoneNumber;

	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void showPhoneNumber() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber);
	}

	@Override
	public String toString() {
		return "name: " + name + " phone: " + phoneNumber;
	}

}
