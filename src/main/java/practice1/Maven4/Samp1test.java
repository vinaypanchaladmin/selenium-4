package practice1.Maven4;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import comutil.Mychoice;

@Listeners(Mychoice.class)
public class Samp1test extends Base {
	
	public WebDriver driver ;
	@Test
	public void launch() {
	setup();


	Samp1 s = new Samp1(Base.driver);
	s.enterusername("standard_user");
	s.enterpassword("secret_sauce");
	s.loginbutton();
	}

}
