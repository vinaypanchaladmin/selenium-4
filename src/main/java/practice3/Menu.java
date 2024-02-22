package practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Menu extends Base3 {

	By menu = By.linkText("Menu");
	By music = By.xpath("//div[@id='ui-id-9']");
	By rock = By.xpath("//div[@id='ui-id-10']");
	By classic = By.xpath("//div[@id='ui-id-12']");
	By iframe = By.className("demo-frame");
	
	By droppable = By.linkText("Droppable");
	By drag = By.id("draggable");
	By drop = By.id("droppable");
	
	public void mstart() throws InterruptedException {
		driver.findElement(menu).click();
		
		WebElement we =driver.findElement(iframe);
		driver.switchTo().frame(we);
		Thread.sleep(3000);
		
		driver.findElement(music).click();
		Thread.sleep(3000);
		driver.findElement(rock).click();
		Thread.sleep(3000);
		driver.findElement(classic).click();
		
	}
			
	public void drop() throws InterruptedException {
		driver.findElement(droppable).click();
		WebElement we =driver.findElement(iframe);
		driver.switchTo().frame(we);
		Thread.sleep(3000);
		
		WebElement s =driver.findElement(drag);
		WebElement d =driver.findElement(drop);
		
		Actions a = new Actions(driver);
		a.dragAndDrop(s, d).build().perform();
		
	}
			
	
}
