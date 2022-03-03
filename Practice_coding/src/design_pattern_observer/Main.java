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

		button.click("ù��°");
		button.click("�ι�°");
		button.click("����°");

	}

}
