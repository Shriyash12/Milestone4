package MS4.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCaseTwoPOM {
	public WebDriver driver;

	By searchBox = By.xpath("//input[@type='search']");
	By searchResult = By.xpath("//div[@id=\"search-header\"]/div[1]/div/div");

	public testCaseTwoPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSearchBox() {
		return driver.findElement(searchBox);
	}

	public WebElement getSearchResult() {
		return driver.findElement(searchResult);
	}
}
