package practice1.Maven4;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Hlo {
	
	@Parameters("browser")
	@Test
	public void xyz(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("chrome setup");
		}
		else if(browser.equalsIgnoreCase("opera")) {
			System.out.println("opera setup");
		}
	}

}
