package exam_book;

public class BookCDMS {

	public static void main(String[] args) {
		
		//SeperateVolume sv1 = new SeperateVolume();
		//SeperateVolume sv1 = new SeperateVolume(null, null, null);
		
		SeperateVolume sv = new SeperateVolume("8454548", "������ ��Ź��", "�Ű��");
		sv.checkOut("Ȧ�浿", "20200125");
		sv.checkIn();
		
		System.out.println();
		
		AppCDInfo ac = new AppCDInfo("2005-7001","Redhat Fedora");
		ac.checkOut("������", "20201020");
		ac.checkIn();
		ac.checkIn();
		
		System.out.println();
		
		//String[] singTitle = {"���", "û��", "�� ���"};
		//MusicCDInfo music = new MusicCDInfo("1", "����", "�赿��", songTitle);
		MusicCDInfo music = new MusicCDInfo("1", "����", "�赿��", new String[] {"���","û��","�� ���"});
		System.out.println(music.toString());

	}

}
