package design_pattern_adapter;

public class Tv implements Electronic220V {

	@Override
	public void connect() {
		System.out.println("220V TV On");
	}
	
	

}
