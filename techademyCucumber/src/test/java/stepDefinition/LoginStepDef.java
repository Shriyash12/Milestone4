/*
 * package stepDefinition;
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.When; import
 * mindtree.techademyCucumber.POM.LoginPOM; import
 * mindtree.techademyCucumber.base.browserBase; import
 * cucumber.api.java.en.Then; import cucumber.api.java.en.And;
 * 
 * public class LoginStepDef extends browserBase {
 * 
 * @Given("^Initialize the browser$") public void initialize_the_browser()
 * throws Throwable { driver = initializeBrowser();
 * 
 * }
 * 
 * @When("^User enters (.+) and (.+)$") public void
 * user_enters_and_and_logs_in(String username, String password)throws Throwable
 * {
 * 
 * LoginPOM lp = new LoginPOM(driver);
 * 
 * lp.getEmail().sendKeys(username); lp.getEmail().sendKeys(password); }
 * 
 * @Then("^User will redirect to Home page and acces the track specified courses$"
 * ) public void
 * user_will_redirect_to_home_page_and_acces_the_track_specified_courses()
 * throws Throwable { System.out.println("Login Successfull"); }
 * 
 * @And("^User will land to Login page \"([^\"]*)\" and need to input credentials$"
 * ) public void
 * user_will_land_to_login_page_something_and_need_to_input_credentials(String
 * url) throws Throwable { driver.get(url); }
 * 
 * @And("^Close the driver$") public void close_the_driver() throws Throwable {
 * driver.close(); driver = null; }
 * 
 * }
 */