package Locator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.DriverUtils;

public class TC004Alert extends DriverUtils {
	
	@Test
	public void alertTest() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String result = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(result, "You successfully clicked an alert");
		Thread.sleep(5000);
	}
	@Test
	public void differentTypeAlerts() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		//create an alert object
		Alert alert = driver.switchTo().alert();
		//accept alert
		alert.accept();
		String result = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(result, "You successfully clicked an alert");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		//create an alert object
		alert = driver.switchTo().alert();
		//reject alert
		alert.dismiss();
		result = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(result, "You clicked: Cancel");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		//create an alert object
		alert = driver.switchTo().alert();
		//get alert text
		System.out.print("alert.getText()");
		//send text in alert box
		alert.sendKeys("Hello world");
		//accept alert
		alert.accept();
		result = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(result, "You entered: Hello world");
		
	}

}
