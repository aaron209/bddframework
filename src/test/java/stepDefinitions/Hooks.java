package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import library.BaseTest;
import library.PropertiesReader;

public class Hooks extends BaseTest{
	
	public PropertiesReader pro;
	public WebDriver driver;
	
	@Before
	public void beforeEachTest() {
		pro = new PropertiesReader();
		driver = lauchApplication();
		driver.get(pro.getData("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@After
	public void afterEachTest() {
		closeBrowser();
	}

}
