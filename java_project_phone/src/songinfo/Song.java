package songinfo;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String[] composer; // composer은 여러명이 올 수도 있기 때문에 String배열 타입
	private int year;
	private int track;

	public Song() {

	}

	public Song(String title, String artist, String album, int year, int track, String... composer) { // 가변길이 메서드는 맨
																										// 마지막에!
		// 필드 생성
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	// getter/ setter
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

	// 출력 메서드
	public void show() {

		System.out.print("노래 제목 : " + title + "\n가수 : " + artist + "\n앨범 : " + album + "\n작곡가 : ");

		for (int i = 0; i < getComposer().length; i++) { // for문을 이용해서 composer[0]부터 뽑아내자.
			System.out.print(composer[i]); // 마지막 배열은 콤마 없이 출력
			if (i < getComposer().length - 1) { // 배열의 마지막 인덱스 앞까지는 컴마로 구분을 지어주자.
				System.out.print(composer[i] + ",");
			}

		}

		System.out.println("\n년도 : " + year + "\n트랙 : " + track);
	}

}
