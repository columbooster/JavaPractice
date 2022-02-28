package design_pattern_adapter;

public class Main {

	public static void main(String[] args) {
		
		Cleaner a1 = new Cleaner();
		
		run(a1);
		
		
		Tv a2 = new Tv();
		
		Electronic110V a3 = new Adapter(a2);
		
		//Adapter a3 = new Adapter(a2);
		
		run(a3);
	
		

	}

	public static void run(Electronic110V electronic110v) {

		electronic110v.powerOn();

	}

}
