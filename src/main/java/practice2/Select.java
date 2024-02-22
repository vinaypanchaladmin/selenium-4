package practice2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select extends Base2{
	
	By drop = By.linkText("Dropdown");
	By button = By.xpath("//button[@id='dropdownMenuButton']");
	By modal = By.linkText("Modal");
    By datepicker  = By.linkText("Datepicker");
    By enterdate = By.xpath("//input[@type='text']");
    By prevbtn = By.xpath("//th[@class='prev']");
    By nextbtn = By.xpath("//th[@class='next']");
    By dateswitch = By.xpath("//th[@class='datepicker-switch']");
	

 public void drop() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	      WebElement a =    wait.until(ExpectedConditions.elementToBeClickable(drop));
	      a.click();
 }
	
 public void button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement b = wait.until(ExpectedConditions.elementToBeClickable(button));
	 b.click();
 }
	
	public void modal() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement c = wait.until(ExpectedConditions.elementToBeClickable(modal));
		c.click();
	}
	
	
	
	public void date() {
		driver.findElement(datepicker).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(enterdate).click();
		String day = "20";
		String expmy= "December 2023";
		String actmy = driver.findElement(dateswitch).getText();
		if(expmy.equals(actmy)) {
			List<WebElement> we = driver.findElements(By.xpath("//tbody/tr/td[@class='day']"));
			for(WebElement s : we) {
				String actday =s.getText();
				if(day.equals(actday)) {
					s.click();
					break ;
				}
				else {
					
				}
			}
			
		}
		
	}
	
     public void selectmenu() {
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.findElement(By.linkText("Selectmenu")).click();
	WebElement we  = driver.findElement(By.tagName("iframe"));
	driver.switchTo().frame(we);
	driver.findElement(By.xpath("//span[@id='speed-button']")).click();
	driver.findElement(By.xpath("//div[@id='ui-id-3']")).click();
	driver.findElement(By.xpath("//span[@id='salutation-button']")).click();
	driver.findElement(By.xpath("//div[@id='ui-id-7']")).click();
	
	
}
	
	
	
	
	
	
}
