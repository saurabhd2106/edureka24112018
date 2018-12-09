package day6;

public class DemoAmazonProject {

	public static void main(String[] args) {
		AmazonProject ap = new AmazonProject();
		
		ap.invokeBrowser("chrome");
		
		System.out.println(ap.getTextFromLink());
		
		System.out.println(ap.getCountOfLinks());
		
		ap.printAllLinks();

	}

}
