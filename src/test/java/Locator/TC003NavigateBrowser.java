package Locator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import Utilities.DriverUtils;

public class TC003NavigateBrowser extends DriverUtils{
	@Test
	public void navigateTOApp() throws InterruptedException {
		driver.get("https://search.yahoo.com/");
		
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	@Test
	public void handleBrowserWindow() throws InterruptedException {
		driver.navigate().to("https://www.google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://search.yahoo.com/");
		Thread.sleep(200);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		Thread.sleep(200);
		}
	@Test
	public void ClickWindowHandle() throws InterruptedException{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.print(driver.getTitle());
		
		driver.findElement(By.id("openwindow")).click();
		System.out.print(driver.getTitle());
		
		driver.findElement(By.id("opentab")).click();
		System.out.print(driver.getTitle());
		Thread.sleep(2000);
		
		System.out.println("current Window is:" + driver.getWindowHandle());
		
		List<String> WindowHandles =  new ArrayList<String>(driver.getWindowHandles());
		
		for(int i=0;i<3;i++) {
			System.out.println("Windows list are: " + WindowHandles.get(i));
		}
		
		System.out.println("------------------------------------------------------");
		driver.switchTo().window(WindowHandles.get(1));
		System.out.println("current Window is:" + driver.getTitle());
		
		driver.switchTo().window(WindowHandles.get(0));
		System.out.println("current Window is:" + driver.getTitle());
		
		driver.switchTo().window(WindowHandles.get(2));
		System.out.println("current Window is:" + driver.getTitle());
		
		
		
		
		
	}
	

}
