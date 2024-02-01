package week2day2;

public class Browser {

	
	String a;
	 	
	public void launchBrowser(String browser) {
		System.out.println(browser+"Browser launch sucessfully");
		
	}
	
	public void loadurl() {
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		
		Browser launch = new Browser();
		launch.launchBrowser("chrome");
		launch.loadurl();

	}

}
