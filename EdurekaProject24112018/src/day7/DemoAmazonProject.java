package day7;

public class DemoAmazonProject {

	public static void main(String[] args) {
		AmazonProject ap = new AmazonProject();
		
		ap.invokeBrowser("chrome");
		
		ap.searchProduct("Rado Watch", "Watches");
		
		ap.printNthProduct(9);
		
		ap.printAllProductsViaScrollDownUsingJS();

	}

}
