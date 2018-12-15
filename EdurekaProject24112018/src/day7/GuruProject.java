package day7;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GuruProject {

	ChromeDriver driver;

	@BeforeClass
	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver01122018/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/v4");
	}

	@Test(priority = 0)
	public void verifyTitleOfThePage() {
		String expectedTitle = "Guru99 Bank Home Page1";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 1000, enabled = false)
	public void verifyLoginToGuru99Application() {

	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
