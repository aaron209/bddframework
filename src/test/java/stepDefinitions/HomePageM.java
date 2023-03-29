package stepDefinitions;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.PropertiesReader;
import pageObjects.HomePage;

public class HomePageM {

	public WebDriver driver;
	public PropertiesReader pro;

	@Given("^The user launches the application$")
	public void the_user_lauches_the_application() {
		pro = new PropertiesReader();
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(pro.getData("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("^The user seaches an item \"([^\"]*)\"$")
	public void the_user_searches_an_item(String items) {
		HomePage homePage = new HomePage(driver);
		homePage.search.sendKeys(items);
		homePage.search.sendKeys(Keys.ENTER);
	}

	@Then("^The user closes the browser$")
	public void the_user_closes_the_browsers() {
		driver.quit();

	}

}
