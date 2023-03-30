package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import library.BasePage;


public class HomePageObject extends BasePage{

	
	public HomePageObject(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id="twotabsearchtextbox")
	public WebElement search;

}
