package songinfo;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String[] composer; // composer�� �������� �� ���� �ֱ� ������ String�迭 Ÿ��
	private int year;
	private int track;

	public Song() {

	}

	public Song(String title, String artist, String album, int year, int track, String... composer) { // �������� �޼���� ��
																										// ��������!
		// �ʵ� ����
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

	// ��� �޼���
	public void show() {

		System.out.print("�뷡 ���� : " + title + "\n���� : " + artist + "\n�ٹ� : " + album + "\n�۰ : ");

		for (int i = 0; i < getComposer().length; i++) { // for���� �̿��ؼ� composer[0]���� �̾Ƴ���.
			System.out.print(composer[i]); // ������ �迭�� �޸� ���� ���
			if (i < getComposer().length - 1) { // �迭�� ������ �ε��� �ձ����� �ĸ��� ������ ��������.
				System.out.print(composer[i] + ",");
			}

		}

		System.out.println("\n�⵵ : " + year + "\nƮ�� : " + track);
	}

}
