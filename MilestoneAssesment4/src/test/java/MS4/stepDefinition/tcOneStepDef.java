package MS4.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import MS4.POM.testCaseOnePOM;
import MS4.POM.testCaseThreePOM;
import MS4.POM.testCaseTwoPOM;
import MS4.base.BaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tcOneStepDef extends BaseClass {
	
	testCaseOnePOM objOne= new testCaseOnePOM(driver);
	
	@Given("^Initialize the browser$")
	public void initialize_the_browser() throws Throwable {
		driver = initializeBrowser();
	}

	@When("^Website is opened click on shop product in navigation bar$")
	public void website_is_opened_click_on_shop_product_in_navigation_bar() throws Throwable {
		objOne.getName().click();
	}

	@Then("^Verify if Tide free and gentle is displayed or not$")
	public void verify_if_tide_free_and_gentle_is_displayed_or_not() throws Throwable {
		String Details= objOne.getClicked().getText();
		System.out.println(Details);
	}

	@And("^Open the website$")
	public void open_the_website() throws Throwable {
		driver.get(prop.getProperty("url"));
	}

	@And("^under Shop Product select powder from dropdown$")
	public void under_shop_product_select_powder_from_dropdown() throws Throwable {
		objOne.getProduct().click();
	}

	@And("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.close();
		driver = null;
	}

	// Step definition of 2nd
	testCaseTwoPOM objTwo = new testCaseTwoPOM(driver);

	@When("^Website is opened search (.+) using search bar$")
	public void website_is_opened_search_using_search_bar(String key) throws Throwable {
		objTwo.getSearchBox().sendKeys(key, Keys.ENTER);
	}

	@Then("^Print the result found$")
	public void print_the_result_found() throws Throwable {
		String getDetails = objTwo.getSearchResult().getText();
		System.out.println(getDetails);
	}

	// step Definition of 3rd
	testCaseThreePOM objThree = new testCaseThreePOM(driver);

	@When("^Website is opened Click on learn more under How to do laundry$")
	public void website_is_opened_click_on_learn_more_under_how_to_do_laundry() throws Throwable {
		objThree.getLearnMore().click();
	}

	@Then("^Look for How to read laundry symbols from grid$")
	public void look_for_how_to_read_laundry_symbols_from_grid() throws Throwable {
		String getDetails = objThree.getLaundrySymbol().getText();
		Assert.assertEquals("How to Read Laundry Symbols", getDetails);
	}

	@And("^print the text and validate$")
	public void print_the_text_and_validate() throws Throwable {

	}

}
