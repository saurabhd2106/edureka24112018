package day5.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTesting {
	
	WebDriver driver;

	public void invokeBrowser(String browserType){
		
		if(browserType.equals("chrome")){
		
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver01122018/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		} else if(browserType.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", 
					"C:/Users/Saurabh Dhingra/workspace/libs/geckodriver-v0.20.1-win64/geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		} else if(browserType.equals("edge")){
			
			System.setProperty("webdriver.edge.driver", 
					"C:/Users/Saurabh Dhingra/workspace/libs/MicrosoftWebDriver.exe");
			
			driver = new EdgeDriver();
			
		}
		
		Dimension dim = new Dimension(768, 1024);
		
		driver.manage().window().setSize(dim);
		
		driver.manage().window().maximize();
		
		
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://amazon.in");
	}
	
	public void printTitle(){
		System.out.println(driver.getTitle());
	}
	
	public void closeBrowser(){
		//driver.close(); // Closes current active window
		
		driver.quit(); // Closes all the windows which are opened by Selenium
	}


}
