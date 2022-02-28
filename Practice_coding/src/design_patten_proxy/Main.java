package design_patten_proxy;

public class Main {

	public static void main(String[] args) {

		Browser browser = new Browser("www.naver.com");
		
		browser.show();
		browser.show();
		browser.show();
		browser.show();
		browser.show();
		
		
		BrowserProxy bp = new BrowserProxy("www.google.com");
		
		bp.show();
		bp.show();
		bp.show();
		bp.show();
		bp.show();
		
		
	}

}
