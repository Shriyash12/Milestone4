
package stepDefinition;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mindtree.myntraCucumber.POM.POMLanding;
import mindtree.myntraCucumber.POM.POMSelect;
import mindtree.myntraCucumber.base.browserBase;

public class demo extends browserBase {

	@Given("^Initialize the browser$")
	public void initialize_the_browser1() throws Throwable {
		driver = initializeBrowser();
	}

	@When("^User enters (.+) and (.+)$")
	public void user_will_input_as_username_and_as_password(String username, String password) throws Throwable {
		POMSelect Se = new POMSelect(driver);

	}

	@When("^User enter top in search bar$")
	public void user_enter_top_in_search_bar() throws Throwable {
		POMSelect Se = new POMSelect(driver);
		Se.getSearch().sendKeys("top", Keys.ENTER);
	}

	@Then("^User will redirect to product page$")
	public void user_will_redirect_to_product_page() throws Throwable {

	}

	@Then("^User will choose the first product$")
	public void user_will_choose_the_first_product() throws Throwable {
		POMLanding La = new POMLanding(driver);
		La.getP().click();
	}

	@Then("^user will add the product to bag$")
	public void user_will_add_the_product_to_bag() throws Throwable {
		POMLanding La = new POMLanding(driver);
		La.getS().click();
		La.getB().click();

		// Close the browser
		driver.close();
		// and make driver null
		driver = null;
	}

	@And("^User will land to home page \"([^\"]*)\"$")
	public void user_will_land_to_home_page_something(String strArg1) throws Throwable {
		driver.get(strArg1);
	}
}