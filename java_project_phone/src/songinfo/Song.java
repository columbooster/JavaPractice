package songinfo;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String[] composer;
	private int year;
	private int track;
	
	
	public Song() {
		
	}
	
	public Song(String title, String artist, String album, int year, int track, String ... composer) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String[] getComposer() {
		return composer;
	}

	public void setComposer(String[] composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	
	public void show() {
		System.out.println("노래 제목 : "+title+"\n가수 : "+artist+"\n앨범 : "+album+"\n작곡가 : "+composer+"\n년도 : "+year+"\n트랙 : "+track);
	}
	
	

}
