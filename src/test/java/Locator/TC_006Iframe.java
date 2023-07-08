package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.DriverUtils;
//definition: iframe is a html tag which basically used for creating one html page inside another html page
public class TC_006Iframe extends DriverUtils {

	@Test
	public void scrollToElement() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions actions = new Actions(driver);
		actions.scrollToElement(driver.findElement(By.xpath("//legend[text()='iFrame Example']"))).build().perform();
		Thread.sleep(5000);
		
		
		//accessing to iframe by name
		//driver.switchTo().frame("courses-iframe");
		
		//accessing to iframe by name
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.linkText("Courses")).getText());
		Thread.sleep(5000);
		
		//accessing to outside of iframe
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//legend[text()='iFrame Example']")).getText());
	}
}
