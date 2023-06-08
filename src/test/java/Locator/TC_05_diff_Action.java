package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.DriverUtils;

public class TC_05_diff_Action extends DriverUtils {
	
	@Test
	public void testDifferntAction() throws InterruptedException {
		driver.get("https://www.daraz.com.bd");
		Actions actions = new Actions(driver);
		Thread.sleep(5000);
		//hover on an element
		WebElement automobiles = driver.findElement(By.id("Level_1_Category_No12"));
		//hover on an element
		actions.clickAndHold(automobiles).build().perform();
		Thread.sleep(5000);
		WebElement vehicleCare = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
		actions.clickAndHold(vehicleCare).build().perform();
		Thread.sleep(5000);
		WebElement Item = driver.findElement(By.xpath("//span[contains(text(),'Jerseys')]"));
		Item.click();
	}
	@Test
	public void scrollTo() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions actions = new Actions(driver);
		//scroll any page by x and y axis
		actions.scrollByAmount(0, 1000).build().perform();
		Thread.sleep(5000);
	}
	@Test
	public void scrollToElement() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions actions = new Actions(driver);
		//scroll until find any element
		actions.scrollToElement(driver.findElement(By.xpath("//legend[text()='iFrame Example']"))).build().perform();
		Thread.sleep(5000);
	}
}
