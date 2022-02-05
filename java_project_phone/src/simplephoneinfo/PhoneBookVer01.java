package simplephoneinfo;

public class PhoneBookVer01 {

	public static void main(String[] args) {
		
		
		PhoneInfo pi1 = new PhoneInfo("임미경", "010-2345-6573", "1965.03.28");
		PhoneInfo pi2 = new PhoneInfo("김현수", "011-6435-1249");
		
		pi1.showPhoneInfo();
		pi2.showPhoneInfo();
		

	}

}
