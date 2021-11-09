/*
 * package MS4.stepDefinition;
 * 
 * import org.junit.Assert;
 * 
 * import MS4.POM.testCaseThreePOM; import MS4.base.BaseClass; import
 * cucumber.api.java.en.And; import cucumber.api.java.en.Given; import
 * cucumber.api.java.en.Then; import cucumber.api.java.en.When;
 * 
 * public class tcThreeStepDef extends BaseClass { testCaseThreePOM objThree =
 * new testCaseThreePOM(driver);
 * 
 * @Given("^Initialize the browser$") public void initialize_the_browser()
 * throws Throwable { driver = initializeBrowser(); }
 * 
 * @When("^Website is opened Click on learn more under How to do laundry$")
 * public void website_is_opened_click_on_learn_more_under_how_to_do_laundry()
 * throws Throwable { objThree.getLearnMore().click(); }
 * 
 * @Then("^Look for How to read laundry symbols from grid$") public void
 * look_for_how_to_read_laundry_symbols_from_grid() throws Throwable { String
 * getDetails = objThree.getLaundrySymbol().getText();
 * Assert.assertEquals("How to Read Laundry Symbols", getDetails); }
 * 
 * @Then("^close the browser$") public void close_the_browser() throws Throwable
 * { driver.close(); driver = null; }
 * 
 * @And("^Open the website$") public void open_the_website() throws Throwable {
 * driver.get(prop.getProperty("url")); }
 * 
 * @And("^print the text and validate$") public void
 * print_the_text_and_validate() throws Throwable {
 * 
 * }
 * 
 * }
 */