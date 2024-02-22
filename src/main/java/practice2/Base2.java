package practice2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;

public class Base2 {
	
public static WebDriver driver ;
	
@Parameters("browser")
	public void setup(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions op =  new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		op.setBinary("C:\\Users\\ASUS\\Downloads\\chrome-win64\\chrome.exe");
		
		
		WebDriver driver = new  ChromeDriver(op);
		
		driver.manage().window().maximize();
		this.driver = driver ;
		
	
	}
	else {
		System.out.println("selected browser is not right");
	}
	}
	
	public void screen(String method) throws IOException {
		String path =System.getProperty("user.dir")+"\\screenshots\\"+method+".png";
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d = new File(path);
		FileUtils.copyFile(f, d);
		
		
		
		
		
		
		
	}

}