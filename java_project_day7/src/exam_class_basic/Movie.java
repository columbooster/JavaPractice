package exam_class_basic;

public class Movie {
	
	public String movieName;
	public String movieDirector;
	public int movieRunTime;
	public String genre;
	
	public void movieData(String movieName, String movieDirector, int movieRunTime, String genre) {
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.movieRunTime = movieRunTime;
		this.genre = genre;
	}
	
	public String printData() {
		return "��ȭ����: " + movieName + " ��ȭ����: " + movieDirector + " ��Ÿ��: " + movieRunTime + "�� �帣: " + genre;
	}
	
	

}
