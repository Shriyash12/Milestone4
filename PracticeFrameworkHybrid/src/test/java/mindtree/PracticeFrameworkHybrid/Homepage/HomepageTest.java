package mindtree.PracticeFrameworkHybrid.Homepage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mindtree.PracticeFrameworkHybrid.base.browserBase;

public class HomepageTest extends browserBase {

	public static Logger log = LogManager.getLogger(HomepageTest.class.getName());

	@BeforeMethod
	public void Initialization() {
		driver = initializeBrowser();
		log.info("Browser driver is initialize");
		driver.get(prop.getProperty("url"));
		log.info("URL is invoked");
	}

	@Test
	public void validateHomepage() {
		POMhomepage ph = new POMhomepage(driver);

		// To check weather image is displayed or not.
		Assert.assertTrue(ph.getBannerImg().isDisplayed());
		log.info("Banner is displaying");

		// To check weather Shop Women button are available or not
		Assert.assertTrue(ph.getShopWomen().isDisplayed());
		log.info("Button is present");

		// To check Shop Men and click to enter Homepage of it and Validate "HOT Deals"

		ph.getShopMen().click();
		String heading = ph.getHeading().getText();
		log.info("Clicked on Shop Men");
		// Checking for HOT DEALS
		Assert.assertEquals(heading, "abcd");
		log.info("Validated Hot Deals heading");
	}

	@AfterMethod
	public void closeDriver() {
		driver.close();
		driver = null;
		log.info("Driver closed and made null");
	}
}
