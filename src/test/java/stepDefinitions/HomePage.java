package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePage {

	public static WebDriver driver;

	@Given("^The user launches the application$")
	public void the_user_lauches_the_application() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://wwww.amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("^The user closes the browser$")
	public void the_user_closes_the_browsers() {
		driver.quit();

	}

}
