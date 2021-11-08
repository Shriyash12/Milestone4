package cucumber.stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import mindtree.PracticeFrameworkHybrid.base.browserBase;
import mindtree.PracticeFrameworkHybrid.login.POMLogin;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefLogin extends browserBase {

	@Given("^User is on Homepage of \"([^\"]*)\" and will click on login button$")
	public void user_is_on_homepage_of_something_and_will_click_on_login_button(String strArg1) throws Throwable {
		driver = initializeBrowser();
		driver.get(strArg1);
	}

	@When("^User click on login then login with email with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_click_on_login_then_login_with_email_with_something_and_something(String strArg1, String strArg2)
			throws Throwable {
		POMLogin pl = new POMLogin(driver);

		pl.getLogin().click();
		pl.getloginWithEmail().click();
		pl.getInputEmail().sendKeys(strArg1);
		pl.getInputPassword().sendKeys(strArg2);
		pl.getSubmitLogin().click();

	}

	@Then("^Home page is populated and logged in$")
	public void home_page_is_populated_and_logged_in() throws Throwable {
		System.out.println("Loggedin Succesfully!!");
	}

	@And("^User can add product to cart and access anytime by login inn$")
	public void user_can_add_product_to_cart_and_access_anytime_by_login_inn() throws Throwable {
		driver.close();
		driver = null;
	}

}
