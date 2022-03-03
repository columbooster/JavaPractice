package design_pattern_observer;

public class Button {

	private String name;
	private IButtonListener buttonListener;

	public Button(String name) {
		this.name = name;
	}

	public void click(String message) {
		buttonListener.clickEvent(this.name+ " = " + message);
	}

	public void addListener(IButtonListener buttonListener) {
		this.buttonListener = buttonListener;
	}

}
