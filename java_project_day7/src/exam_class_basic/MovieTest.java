package exam_class_basic;

import java.util.Scanner;

public class MovieTest {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
	/*	Movie movie1 = new Movie();
		
		movie1.movieData("AVARTA", "Christopher Nolran", 300, "SF");
		
		System.out.println(movie1.toString());
		
		Movie movie2 = new Movie();
		
		movie2.movieName = "Jesus";
		movie2.movieDirector = "jieijeg";
		movie2.movieRunTime = 240;
		movie2.genre = "Drama";
		
		System.out.println(movie2.toString());
		
		Scanner sc = new Scanner(System.in);
		
		Movie movie3 = new Movie();
		
		System.out.println("��ȭ����: ");
		String movieName = sc.nextLine();
		
		System.out.println("��ȭ����: ");
		String movieDirector = sc.nextLine();
		
		System.out.println("��Ÿ��: ");
		String movieRunTime = sc.nextLine();
		
		System.out.println("�帣: ");
		String genre = sc.nextLine();
		
		movie3.movieData(movieName, movieDirector, 90, genre);
		
		System.out.println(movie3.toString());
	*/	
		
		Movie mv2 = new Movie();
		inputData(mv2);
		
		
		Movie mv3 = new Movie();
		inputData(mv3);
		
		
		System.out.println("��ȭ����\t ��ȭ����\t ��Ÿ��\t �帣");
		System.out.println(mv2.toString());
		System.out.println(mv3.toString());

	}
	
	public static void inputData(Movie mv) {
		
		System.out.println("��ȭ����: ");
		mv.movieName = input.nextLine();
		
		System.out.println("��ȭ����: ");
		mv.movieDirector = input.nextLine();
		
		System.out.println("��Ÿ��: ");
		mv.movieRunTime = input.nextInt();
		input.nextLine();
		
		System.out.println("�帣: ");
		mv.genre = input.nextLine();
		
	}
	
	
	
	
	

}
