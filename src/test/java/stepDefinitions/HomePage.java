package stepDefinitions;

import io.cucumber.java.en.When;
import library.BaseTest;
import pageObjects.HomePageObject;

public class HomePage extends BaseTest{
	
	
	HomePageObject homePage;
	BaseTest baseTest;

	@When("^The user seaches an item \"([^\"]*)\"$")
	public void the_user_searches_an_item(String items) {
		baseTest = new BaseTest();
		homePage = new HomePageObject(baseTest.getDriver());
		homePage.search.sendKeys(items);
		
	}

}
