package exam_book;

public class MusicCDInfo extends CDInfo {
	
	private String registerNo;
	private String title;
	private String artist;
	private String[] songTitle;
	
	public MusicCDInfo(String registerNo, String title, String artist, String[] songTitle) {
		super(registerNo, title);
		this.artist = artist;
		this.songTitle = songTitle;
	}

	public String getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
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

	public String[] getSongTitle() {
		return songTitle;
	}

	public void setSongTitle(String[] songTitle) {
		this.songTitle = songTitle;
	}
	
	public String toString() {
		return registerNo + " " + title + " " + artist + " " + songTitle;
	}

}
