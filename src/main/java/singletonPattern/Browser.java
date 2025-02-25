package singletonPattern;

public class Browser {
	
	private static Browser browser;
	
	private Browser() {
		
	}
	
	public static Browser getBrowser() {
		if(browser==null) {
			browser=new Browser();
		}
		return browser;
	}
	
	public void displaymsg() {
		System.out.println("brwser info");
	}

}
