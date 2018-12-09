package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public static void main(String[] args) {
		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver01122018/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");

		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent Session Id : "+parentWindow);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.tagName("button")).click();
		
		String childWindow;
		childWindow =	driver.getWindowHandles().toArray()[1].toString();
		
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getTitle());
		

	}

}