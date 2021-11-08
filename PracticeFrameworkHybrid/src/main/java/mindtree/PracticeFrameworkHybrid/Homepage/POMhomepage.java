package mindtree.PracticeFrameworkHybrid.Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMhomepage {
	public WebDriver driver;

	By checkBannerImg = By.xpath("//div[@class='genderPickerBanner']");
	By shopWbutton = By.xpath("//div[@class='undefined button iconDefault']");
	By shopMbutton = By.xpath("//div[@class='undefined button iconDefault'][2]");
	By checkHeading = By.xpath("//div[@id=\"pb2-0-0\"]");

	public POMhomepage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getBannerImg() {
		return driver.findElement(checkBannerImg);
	}

	public WebElement getShopWomen() {
		return driver.findElement(shopWbutton);
	}

	public WebElement getShopMen() {
		return driver.findElement(shopMbutton);
	}

	public WebElement getHeading() {
		return driver.findElement(checkHeading);
	}
	
}
