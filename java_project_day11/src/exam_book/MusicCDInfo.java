package exam_book;

import java.util.Arrays;

public class MusicCDInfo extends CDInfo {
	

	private String artist;
	private String[] songTitle;
	
	public MusicCDInfo(String registerNo, String title, String artist, String[] songTitle) {
		super(registerNo, title); //부모클래스 생성자 호출
		this.artist = artist;
		this.songTitle = songTitle;
	}
	
	public String songData() {
		String sTitle = "";
		for (String song : songTitle) { // for(자료형 변수명 : 배열명){}
			sTitle += (song+" ");
		}
		/*for(int i = 0; i < songTitle.length; i++){
		 *  sTitle += (songTitle[i] + " )
		 * } 
		 */
		return sTitle;
	}

	
	public String toString() {
		//return artist + " " + getTitle() + "[ " + songData() + " ] 음반.";
		return artist + " " + getTitle() + " " + Arrays.toString(songTitle);
	}

}
