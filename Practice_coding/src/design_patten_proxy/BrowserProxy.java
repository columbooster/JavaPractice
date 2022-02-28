package design_patten_proxy;

public class BrowserProxy implements IBrowser {
	
	private String url;
	private Html html;
	
	
	public BrowserProxy(String url) {
		this.url = url;
	}
	
	
	@Override
	public Html show() {
		
		if(html == null) {
			System.out.println("BrowserProxy loading Html from : " + url);
			this.html = new Html(url);
		}
		
		System.out.println("BrowserProxy use cache Html");
		return html;
	
	}
	
	

}
