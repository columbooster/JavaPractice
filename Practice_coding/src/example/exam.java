package example;

public class exam {

	public static void prn() throws Exception {
		throw new Exception("���ܰ� �߻�!!");
		}
	
	
	public static void main(String[] args) {
		
		
		try {
			prn();
		} catch (Exception e) {
			System.out.print("���ܰ� �߻��Ǿ� ó���մϴ� ");
			e.printStackTrace();
			
		}	
	}

}
