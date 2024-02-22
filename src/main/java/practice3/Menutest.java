package practice3;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import comut2.Youlisten;


public class Menutest extends Base3{

	public WebDriver driver ;
	
	
	public void mytest() throws InterruptedException, IOException {
		launch();
		this.driver = Base3.driver;
		driver.get("https://jqueryui.com/");
		Menu m = new Menu();
		m.mstart();
				
		
		
	}
	
	@Test
	public void droptest() throws InterruptedException {
		launch();
		this.driver = Base3.driver;
		driver.get("https://jqueryui.com/");
		Menu m =new Menu();
		m.drop();
		
	}
	
}
