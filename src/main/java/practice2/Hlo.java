package practice2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import comut2.Uslisten;

@Listeners(Uslisten.class)
public class Hlo extends Base2{
	
	public WebDriver driver ;
	
	
	public void search() {
		setup("chrome");
		this.driver = Base2.driver ;
		driver.get("https://www.google.com");
	}


}
