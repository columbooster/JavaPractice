package design_pattern_adapter;

public class Adapter implements Electronic110V {

	private Electronic220V electronic220v;

	public Adapter(Electronic220V electronic220v) {
		this.electronic220v = electronic220v;
	}

	@Override
	public void powerOn() {

		electronic220v.connect();

	}

}
