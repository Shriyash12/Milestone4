package mindtree.PracticeFrameworkHybrid;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;

import mindtree.PracticeFrameworkHybrid.base.browserBase;

public class listener extends browserBase implements ITestListener {
@Override
public void onTestFailure(ITestResult result) {
	try {
		browserBase objBB=new browserBase();
		
		objBB.getScreenshot(result.getName());
		ExtentTest test = extent.createTest(driver.getTitle());		
		test.fail("Test failed");
		test.addScreenCaptureFromPath("C:\\Users\\M1073173\\SeleniumStuff\\PracticeFrameworkHybrid\\Screenshot\\screenshot.png");
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
