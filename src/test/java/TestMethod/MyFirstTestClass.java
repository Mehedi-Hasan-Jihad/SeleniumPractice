package TestMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utilities.DriverUtils;

public class MyFirstTestClass extends DriverUtils{
	@Test(priority = 0)
	public void testpageTitle() {
		//load website
		driver.get("https://www.google.com");
		//test page title
		assertEquals(driver.getTitle(), "Google");	
		//task for first day url checking
		String url = driver.getCurrentUrl();
		assertEquals(url,"https://www.google.com/");
		
	}
	@Test(priority = 1)
	public void TestURLandTitle() {	
		//load website
		driver.get("https://www.w3schools.com/");
		String Title = driver.getTitle();
		String Url = driver.getCurrentUrl();
		assertEquals(Title, "W3Schools Online Web Tutorials");
		//URL test
		assertEquals(Url, "https://www.w3schools.com/");
		
	}

}
