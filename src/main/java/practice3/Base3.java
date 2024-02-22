package practice3;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Base3 {
	
	
	public static WebDriver driver ;
	
	
	public void launch()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		op.setBinary("C:\\Users\\ASUS\\Downloads\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		
		this.driver = driver ;
		
	}
	
	public void tear() {
		driver.quit();
	}
	
	
	public void scn(String method) throws IOException {
		String  path  = System.getProperty("user.dir")+"\\screenshots\\"+method+".jpg";
		File d = new File(path);
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, d);
	}
}
