//dropdown element are selected by select also we can select multiple elements like tab and select type elements by using a combination
//of select and action
//also used here hard and soft assertion


package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utilities.DriverUtils;
public class TC007Select extends DriverUtils {

	@Test
	public void scrollToElement() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(dropdown);
		
		//select by index 
		select.selectByIndex(3);
		Thread.sleep(5000);
		//select by html value
		select.selectByValue("option2");
		Thread.sleep(5000);
		//select by name inside the option
		select.selectByVisibleText("Option1");
		Thread.sleep(5000);

	}
	
	
	@Test
	public void SelectMultipleselectctrl() throws InterruptedException {
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Select select = new Select(driver.findElement(By.name("cars")));
		Actions action = new Actions(driver);
		driver.switchTo().frame("iframeResult");
		select.selectByVisibleText("Volvo");
		Thread.sleep(5000);
	}
	
}
