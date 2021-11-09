package MS4.listner;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;

import MS4.base.BaseClass;

public class listener extends BaseClass implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		try {
			BaseClass objBB = new BaseClass();

			objBB.getScreenshot(result.getName());
			ExtentTest test = extent.createTest(driver.getTitle());
			test.fail("Test failed");
			test.addScreenCaptureFromPath(
					"C:\\Users\\M1073173\\SeleniumStuff\\MilestoneAssesment4\\Screenshot\\screenshot.png");
			extent.flush();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentTest test = extent.createTest(driver.getTitle());
		test.pass("This test is passed");
		extent.flush();
	}
}
