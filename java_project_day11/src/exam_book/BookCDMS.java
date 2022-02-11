package exam_book;

public class BookCDMS {

	public static void main(String[] args) {
		
		//SeperateVolume sv1 = new SeperateVolume();
		//SeperateVolume sv1 = new SeperateVolume(null, null, null);
		
		SeperateVolume sv = new SeperateVolume("8454548", "¾ö¸¶¸¦ ºÎÅ¹ÇØ", "½Å°æ¼÷");
		sv.checkOut("È¦±æµ¿", "20200125");
		sv.checkIn();
		
		System.out.println();
		
		AppCDInfo ac = new AppCDInfo("2005-7001","Redhat Fedora");
		ac.checkOut("¹ÚÈñÁø", "20201020");
		ac.checkIn();
		ac.checkIn();
		
		System.out.println();
		
		//String[] singTitle = {"°í¹é", "Ã»Ãá", "³» »ç¶÷"};
		//MusicCDInfo music = new MusicCDInfo("1", "µ¿Çà", "±èµ¿·ü", songTitle);
		MusicCDInfo music = new MusicCDInfo("1", "µ¿Çà", "±èµ¿·ü", new String[] {"°í¹é","Ã»Ãá","³» »ç¶÷"});
		System.out.println(music.toString());

	}

}
