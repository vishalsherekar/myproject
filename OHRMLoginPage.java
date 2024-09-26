import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OHRMLoginPage {
	
	By username=By.name("username");
	By password=By.name("password");
	By loginButton=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	By forgotPwdLink=By.cssSelector("div.orangehrm-login-forgot>p");
	By OHRMLink=By.linkText(" OrangeHRM, Inc.");
	By errormsg=By.xpath("//div[@class='orangehrm-login-form']/div/div/p");
	WebDriver driver;

	public OHRMLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	//Methods
	
	public void setUsername(String un) {
		driver.findElement(username).sendKeys(un);
	}

	public void setPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickLoginButton() {
		driver.findElement(loginButton).click();;
	}
	
	public void clickForgotpwdLink() {
		driver.findElement(forgotPwdLink).click();
	}
	
	public String getErrorMsg() {
		return driver.findElement(errormsg).getText();
	}
	
	public void clickOHRMLink() {

		   driver.findElement(OHRMLink).click();

		}

}