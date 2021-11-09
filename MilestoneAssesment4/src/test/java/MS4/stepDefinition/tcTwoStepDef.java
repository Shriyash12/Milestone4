/*
 * package MS4.stepDefinition;
 * 
 * import org.openqa.selenium.Keys;
 * 
 * import MS4.POM.testCaseTwoPOM; import MS4.base.BaseClass; import
 * cucumber.api.java.en.And; import cucumber.api.java.en.Given; import
 * cucumber.api.java.en.Then; import cucumber.api.java.en.When;
 * 
 * public class tcTwoStepDef extends BaseClass { testCaseTwoPOM objTwo = new
 * testCaseTwoPOM(driver);
 * 
 * @Given("^Initialize the browser$") public void initialize_the_browser()
 * throws Throwable { driver = initializeBrowser(); }
 * 
 * @When("^Website is opened search (.+) using search bar$") public void
 * website_is_opened_search_using_search_bar(String key) throws Throwable {
 * objTwo.getSearchBox().sendKeys(key, Keys.ENTER); }
 * 
 * @Then("^Print the result found$") public void print_the_result_found() throws
 * Throwable { String getDetails = objTwo.getSearchResult().getText();
 * System.out.println(getDetails); }
 * 
 * @And("^Open the website$") public void open_the_website() throws Throwable {
 * driver.get(prop.getProperty("url")); }
 * 
 * @And("^close the browser $") public void close_the_browser() throws Throwable
 * { driver.close(); driver = null; } }
 */