package Locator;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.DriverUtils;

public class TC_008SeleniumWaits extends DriverUtils {
	
	@Test
	public void threadwait() {

	driver.get("https://qavbox.github.io/demo/delay/");
	driver.findElement(By.name("commit")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Assert.assertEquals(driver.findElement(By.id("two")).getText(), "I am here!");
	
}
	@Test
	public void ImplicitWait() {
		//implicit wait is known as static wait but in updated version of selenium it is also made as dynamic wait
		//implicijt wait basically use untill the given time and until solve any findelements error occur within that time if error/exception solve it will immediately close the browser
		driver.get("https://qavbox.github.io/demo/delay/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("commit1")).click();
		Assert.assertEquals(driver.findElement(By.id("delay")).getText(), "I appeared after 5 sec");
		
	}
	
	
	
	@Test
	public void WebdriverWait() {
		//Webdriver wait is known as dynamic wait 
		//Basically webdriver wait use untill the given time and if it will find the element withing the time it will immediately close the browser
		
		driver.get("https://qavbox.github.io/demo/alerts/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		driver.findElement(By.id("delayalert")).click();
		//The interesting fact here in webdriver wait is we don't need to use switch method here or find the element which we need it returns the element automatically for which it was waiting
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
		
		Assert.assertEquals(alert.getText(), "I appeared after 5 seconds!");
		alert.accept();
		
	}
	
}