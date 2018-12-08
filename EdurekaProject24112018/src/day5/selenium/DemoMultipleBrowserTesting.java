package day5.selenium;

public class DemoMultipleBrowserTesting {

	public static void main(String[] args) {
		MultipleBrowserTesting mb = new MultipleBrowserTesting();
		
		mb.invokeBrowser("firefox");
		
		mb.printTitle();
		

	}

}
