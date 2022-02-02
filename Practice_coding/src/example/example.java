package example;

public class example {

	public static void main(String[] args) {
		
		Card card = new Card();
		
		String a = card.sum("djhufhef");
		
		System.out.println(a);
		
		Calculator ca = new Calculator();
		
		int f = ca.hope(23, 3);
		
		System.out.println(f);
		
		System.out.println(ca.hope(23, 242));
		
		
		
		
	}

}


class Card {
	
	public String sum(String s) {
		return s;
	}
	

	
}


class Calculator {
	
	public Integer hope(int a, int b) {
		return a+b;
		
	}
}