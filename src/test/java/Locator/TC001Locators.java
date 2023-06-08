package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilities.DriverUtils;


public class TC001Locators extends DriverUtils {
	@Test
	public void Test() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement option1 = driver.findElement(By.id("checkBoxOption1"));
		option1.click();
		WebElement option2 = driver.findElement(By.name("checkBoxOption2"));
		option2.click();
		Thread.sleep(5000);
		
		WebElement radioBtn1 = driver.findElement(By.className("radioButton"));
		radioBtn1.click();
		Thread.sleep(2000);
		
		WebElement freeaccess = driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
		System.out.println(freeaccess.getText());
		Thread.sleep(3000);
		
		WebElement freeaccess2= driver.findElement(By.partialLinkText("Free Access "));
		System.out.println(freeaccess2.getText());
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[value='radio2']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		Thread.sleep(2000);
		
		//NB: for searching Id as cssSelector we can use # like #idname and for class we can use . like .classname
		
		
	}
}
