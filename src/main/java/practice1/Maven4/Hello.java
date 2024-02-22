package practice1.Maven4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Hello {

	public WebDriver driver ;
	@Test
	public void launch() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver.exe");
		     
		     ChromeOptions op = new  ChromeOptions();
		     op.addArguments("--remote-allow-origins=*");
		     op.setBinary("C:\\Users\\ASUS\\Downloads\\chrome-win64\\chrome.exe");
		     WebDriver driver = new  ChromeDriver(op);
		    driver.manage().window().maximize();
		    driver.get("https://www.google.com");
	}
}
