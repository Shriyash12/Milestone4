package mindtree.PracticeFrameworkHybrid.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMLogin {

	public WebDriver driver;

	By login = By.xpath("//a[@id='loginLink']");
	By loginWithEmail = By.xpath("//button[@id='web_email_login']");
	By inputEmail = By.xpath("//input[@id='email_input']");
	By inputPassword = By.xpath("//input[@id='mob_password']");
	By submitLogin = By.xpath("//button[@id='mob_login_password_submit']");

	/*
	 * This is also one method to make page object
	 * 
	 * @FindBy(id="loginLink") WebElement login1;
	 */

	// Constructor to instantiate driver.
	public POMLogin(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLogin() {
		return driver.findElement(login);
	}

	public WebElement getloginWithEmail() {
		return driver.findElement(loginWithEmail);
	}

	public WebElement getInputEmail() {
		return driver.findElement(inputEmail);
	}

	public WebElement getInputPassword() {
		return driver.findElement(inputPassword);
	}

	public WebElement getSubmitLogin() {
		return driver.findElement(submitLogin);
	}
}
