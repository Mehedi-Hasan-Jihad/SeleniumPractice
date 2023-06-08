package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilities.DriverUtils;

public class TC002AdvanceLocator extends DriverUtils{
	@Test
	public void TestLocator() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		String title = driver.findElement(By.cssSelector("h1")).getText();
		String title = driver.findElement(By.xpath("//h1")).getText();
		
		System.out.println(title);
	
		
	}
	@Test
	public void testWrite() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement Input = driver.findElement(By.id("autocomplete"));
		
		Input.sendKeys("This is for test");
		Thread.sleep(2000);
		Input.clear();
		Thread.sleep(200);
	}
	
	@Test
	public void testGetAtrribute() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement  radioBtn3 = driver.findElement(By.xpath("//*[@value='radio3']"));
		String classValue = radioBtn3.getAttribute("class");
		System.out.println(classValue);
		Thread.sleep(200);
	}
	
	@Test
	public void testDisplay() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dispayInputField = driver.findElement(By.id("displayed-text"));
		System.out.println(dispayInputField.isDisplayed());
		driver.findElement(By.id("hide-textbox")).click();
		System.out.println(dispayInputField);
		Thread.sleep(200);
	}
	
	@Test
	public void testSelectStatus() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radiobtn3 = driver.findElement(By.xpath("//input[@value='radio3']"));
		System.out.println(radiobtn3.isSelected());
		
		radiobtn3.click();
		System.out.println(radiobtn3.isSelected());
		Thread.sleep(200);
	}
}
