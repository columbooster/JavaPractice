package exam_book;

public class BookCDMS {

	public static void main(String[] args) {
		
		SeperateVolume sv = new SeperateVolume("8454548", "¾ö¸¶¸¦ ºÎÅ¹ÇØ", "½Å°æ¼÷");
		sv.checkOut("È¦±æµ¿", "20200125");
		sv.checkIn();
		
		System.out.println();
		
		AppCDInfo ac = new AppCDInfo("1234234","°Å¸®¿¡¼­");
		ac.checkOut("±è°æ¼÷", "20201020");
		ac.checkIn();

	}

}
