package MS4.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCaseOnePOM {
	public WebDriver driver;
	
	By ShopPro=By.xpath("//div[@class='header-main-menu']/div[1]/a");
	
	By product=By.xpath("//div[@class='submenu-child']/div[3]/a[1]");
	
	By click=By.xpath("//strong[text()='Free and Gentle']");
	
	public testCaseOnePOM(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getName()
	{
		 
		return driver.findElement(ShopPro);
	}
	
	public WebElement getProduct()
	{
		return driver.findElement(product);
	}
	
	public WebElement getClicked()
	{
		return driver.findElement(click);
	}

}

