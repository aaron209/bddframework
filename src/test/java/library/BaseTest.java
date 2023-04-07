package library;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class BaseTest {

	public PropertiesReader pro;
	public static WebDriver driver;

	public WebDriver lauchApplication() {
		if (driver == null) {
			pro = new PropertiesReader();
			System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get(pro.getData("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Reporter.log("The application is launched successfully!!");
		}
		return driver;
	}

	public void closeBrowser() {
		driver.quit();

	}

}
