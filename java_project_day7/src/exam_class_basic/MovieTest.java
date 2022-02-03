package exam_class_basic;

public class MovieTest {

	public static void main(String[] args) {
		Movie movie1 = new Movie();
		
		movie1.movieData("AVARTA", "Christopher Nolran", 300, "SF");
		
		System.out.println(movie1.printData());
		
		Movie movie2 = new Movie();
		
		movie2.movieName = "Jesus";
		movie2.movieDirector = "jieijeg";
		movie2.movieRunTime = 240;
		movie2.genre = "Drama";
		
		System.out.println(movie2.printData());
		
		

	}

}
