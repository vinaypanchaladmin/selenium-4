package practice2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Selectperform extends Select{
	
	public WebDriver driver;
	
	
	
	
	public void verify() {
		setup("chrome");
		this.driver = Base2.driver ;
		driver.get("https://formy-project.herokuapp.com/");
		Select s = new Select();
		s.drop();
		s.button();
		s.modal();
		
		
		
	}
	
	
	public void verifydate() {
		setup("chrome");
		this.driver = Base2.driver;
		driver.get("https://formy-project.herokuapp.com/");
		Select s = new Select();
		s.date();
		
	}

	@Test
	public void menuverify() {
		setup("chrome");
		this.driver =Base2.driver;
		driver.get("https://jqueryui.com/");
		Select s = new Select();
		s.selectmenu();
	}
}
