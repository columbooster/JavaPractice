package songinfo;

public class SongInformation {

	public static void main(String[] args) {
		
		Song song = new Song("Dancing Queen","ABBA","Arrival",1977,2,"Benny Andersson","Bjorn Ulvaeus");
		
		song.show();
		
		String[] composer = new String[0];
		
		for(int i =0; i<song.getComposer().length; i++) {
			System.out.print(composer[i]);
		}
		
		System.out.println(song.getComposer());

	}

}
