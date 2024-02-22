package practice1.Maven4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Samp1 extends Base {

	public WebDriver driver ;
	
	public Samp1(WebDriver driver) {
		this.driver = driver;
	}

	By username =By.id("user-name");
	By password = By.id("password");
	By loginbtn = By.name("login-button");
	
	public void enterusername(String name) {
		driver.findElement(username).sendKeys(name);
	}

	public void enterpassword(String userpassword) {
		driver.findElement(password).sendKeys(userpassword);
	}
	
	public void loginbutton() {
		driver.findElement(loginbtn).click();
	}
		
		
	
	
	
}
