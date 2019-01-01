package day9;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridExecution {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver;
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		
		URL url = new URL("http://192.168.0.6:4444/wd/hub");
		
		driver = new RemoteWebDriver(url, capabilities);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://qatechhub.com");
		

	}

}
