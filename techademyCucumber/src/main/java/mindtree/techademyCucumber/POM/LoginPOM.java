
  package mindtree.techademyCucumber.POM;
  
  import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.WebElement;
  
  public class LoginPOM { public WebDriver driver;
  
  By inputEmail = By.xpath("//input[@name='userNameOrEmailAddress']"); By
  inputPassword = By.xpath("//input[@name='password']");
  
  public LoginPOM(WebDriver driver) { this.driver = driver; }
  
  public WebElement getPassword() { return driver.findElement(inputPassword); }
  
  public WebElement getEmail() { return driver.findElement(inputEmail); } }
 