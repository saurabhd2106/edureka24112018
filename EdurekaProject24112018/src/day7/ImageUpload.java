package day7;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageUpload {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver01122018/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://images.google.com");

		driver.findElement(By.className("S3Wjs")).click();
		
		driver.findElement(By.linkText("Upload an image")).click();
		
		driver.findElement(By.id("qbfile")).click();
		
		Runtime.getRuntime().exec("C:/Users/Saurabh Dhingra/git/edureka24112018/EdurekaProject24112018/scripts/uploadImage.exe");
	}

}
