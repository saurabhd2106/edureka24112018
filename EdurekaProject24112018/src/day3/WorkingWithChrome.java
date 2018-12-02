package day3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	
	ChromeDriver driver;

	public void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver01122018/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		Dimension dim = new Dimension(768, 1024);
		
		driver.manage().window().setSize(dim);
		
		//driver.manage().window().maximize();
		
		
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://qatechhub.com");
	}
	
	public void printTitle(){
		System.out.println(driver.getTitle());
	}
	
	public void closeBrowser(){
		//driver.close(); // Closes current active window
		
		driver.quit(); // Closes all the windows which are opened by Selenium
	}
}
