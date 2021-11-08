package mindtree.myntraCucumber.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMLanding {
	public WebDriver driver;

	By getProduct = By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a");
	By getSize = By.xpath("//*[@id=\"sizeButtonsContainer\"]/div[2]/div[2]/div[1]/button/pb");
	By clickAddtoBag = By.xpath("//*[@id=\"mountRoot\"]/div/div/div/main/div[2]/div[2]/div[3]/div/div[1]");
	
	
	public POMLanding(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getP() {
		return driver.findElement(getProduct);
	}
	
	public WebElement getS() {
		return driver.findElement(getSize);
	}
	
	public WebElement getB() {
		return driver.findElement(clickAddtoBag);
	}
}


