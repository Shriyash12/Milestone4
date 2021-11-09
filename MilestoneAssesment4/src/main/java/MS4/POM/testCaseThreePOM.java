package MS4.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCaseThreePOM {
	public WebDriver driver;

	By learnMore = By.xpath("//a[@data-action-detail='/en-us/how-to-wash-clothes/how-to-do-laundry']");
	By laundrySymbol = By.xpath("//main[@id=\"site-content\"]/div/div/div/div[2]/div[2]/div/div/div/div[7]/div/div[2]");

	public testCaseThreePOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLearnMore() {
		return driver.findElement(learnMore);
	}

	public WebElement getLaundrySymbol() {
		return driver.findElement(laundrySymbol);
	}
}
