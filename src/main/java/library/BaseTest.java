package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

	private static WebDriver driver;
	public PropertiesReader pro;

	public WebDriver lauchApplication() {
		pro = new PropertiesReader();
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		return driver;
	}

	public void closeBrowser() {
		driver.quit();

	}

	public WebDriver getDriver() {
		return driver;
	}

}
