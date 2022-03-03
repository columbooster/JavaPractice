package design_pattern_observer;

public class Main {

	public static void main(String[] args) {

		Button button = new Button("Start");

		IButtonListener buttonListener = new IButtonListener() {

			@Override
			public void clickEvent(String event) {
				System.out.println("Click Event : " + event);
			}
		};

		button.addListener(buttonListener);

		button.click("첫번째");
		button.click("두번째");
		button.click("세번째");

	}

}
