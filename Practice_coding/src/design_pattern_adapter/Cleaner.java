package design_pattern_adapter;

public class Cleaner implements Electronic110V {

	@Override
	public void powerOn() {
		System.out.println("110V Cleaner On");
	}

	
	
	

}
