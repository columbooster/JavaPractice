package exam_book;

public class BookCDMS {

	public static void main(String[] args) {
		
		SeperateVolume sv = new SeperateVolume("8454548", "������ ��Ź��", "�Ű��");
		sv.checkOut("Ȧ�浿", "20200125");
		sv.checkIn();
		
		System.out.println();
		
		AppCDInfo ac = new AppCDInfo("1234234","�Ÿ�����");
		ac.checkOut("����", "20201020");
		ac.checkIn();

	}

}
