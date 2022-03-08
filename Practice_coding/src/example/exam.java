package example;

public class exam {

	public static void prn() throws Exception {
		throw new Exception("예외가 발생!!");
		}
	
	
	public static void main(String[] args) {
		
		
		try {
			prn();
		} catch (Exception e) {
			System.out.print("예외가 발생되어 처리합니다 ");
			e.printStackTrace();
			
		}	
	}

}
