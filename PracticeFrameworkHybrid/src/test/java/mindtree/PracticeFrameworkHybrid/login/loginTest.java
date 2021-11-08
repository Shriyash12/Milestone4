package mindtree.PracticeFrameworkHybrid.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mindtree.PracticeFrameworkHybrid.base.browserBase;

public class loginTest extends browserBase {

	public static Logger log = LogManager.getLogger(loginTest.class.getName());

	@BeforeMethod
	public void initialization() {
		driver = initializeBrowser();
		log.info("Browser driver is initialize");
		driver.get(prop.getProperty("url"));
		log.info("URL is invoked");
	}

	@Test(dataProvider = "provideData")
	public void login(String username, String pass) {
		POMLogin pl = new POMLogin(driver);

		pl.getLogin().click();
		pl.getloginWithEmail().click();
		pl.getInputEmail().sendKeys(username);
		pl.getInputPassword().sendKeys(pass);
		pl.getSubmitLogin().click();
		log.info("Login Done!");

	}

	@DataProvider
	public Object[][] provideData() {
		Object[][] objData = new Object[2][2];

		objData[0][0] = "FirstUsername";
		objData[0][1] = "FirstPass";

		objData[1][0] = "SecondUsername";
		objData[1][1] = "SecondPass";
		return objData;
	}

	@AfterMethod
	public void closeDriver() {
		driver.close();
		driver = null;
		log.info("Close driver and made it null");
	}

}
