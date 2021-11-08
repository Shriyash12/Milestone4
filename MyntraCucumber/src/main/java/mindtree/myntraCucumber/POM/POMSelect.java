package mindtree.myntraCucumber.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMSelect {
	public WebDriver driver;

	By searchProduct = By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input");
	
	
	public POMSelect(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSearch() {
		return driver.findElement(searchProduct);
	}
}

