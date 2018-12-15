package day7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonProject {

	WebDriver driver;
	List<WebElement> allLink;

	public void invokeBrowser(String browserType) {

		if (browserType.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver01122018/chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browserType.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/geckodriver-v0.20.1-win64/geckodriver.exe");

			driver = new FirefoxDriver();

		} else if (browserType.equals("edge")) {

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

		driver.get("https://www.amazon.in/");

	}

	public void searchProduct(String product, String category) {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

		Select selCategory = new Select(dropdown);

		selCategory.selectByVisibleText(category);

		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']/input[@value='Go']")).click();

		String result = driver.findElement(By.id("s-result-count")).getText();

		System.out.println("Result : " + result);
	}

	public void printNthProduct(int itemNumber) {

		String productXpath = String.format("//ul[@id='s-results-list-atf']/li[@id='result_%d']", (itemNumber - 1));

		System.out.println(driver.findElement(By.xpath(productXpath)).getText());
	}

	public void printAllProducts() {

		List<WebElement> allProducts = driver.findElements(By.xpath("//ul[@id='s-results-list-atf']/li"));

		for (WebElement product : allProducts) {

			System.out.println("--------------------------------------------");
			System.out.println(product.getText());

		}
	}

	public void printAllProductsViaScrollDown() {

		List<WebElement> allProducts = driver.findElements(By.xpath("//ul[@id='s-results-list-atf']/li"));

		Actions action = new Actions(driver);

		for (WebElement product : allProducts) {

			action.moveToElement(product).build().perform();
			System.out.println("--------------------------------------------");
			System.out.println(product.getText());

		}
	}

	public void printAllProductsViaScrollDownUsingJS() {

		List<WebElement> allProducts = driver.findElements(By.xpath("//ul[@id='s-results-list-atf']/li"));

		int X, Y;
		for (WebElement product : allProducts) {

			X = product.getLocation().x;
			Y = product.getLocation().y;

			scrollDown(X, Y);

			System.out.println("--------------------------------------------");
			System.out.println(product.getText());

		}
	}

	private void scrollDown(int x, int y) {

		JavascriptExecutor jsEngine;
		String jsCommand;

		jsCommand = String.format("window.scrollBy(%d,%d)", x, y);

		jsEngine = (JavascriptExecutor) driver;

		jsEngine.executeScript(jsCommand);

	}
}
