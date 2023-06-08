package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverUtils {
	
	
	public WebDriver driver;
	@BeforeSuite
	public void setup() {
		//open a browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterSuite
	public void TearDown() {
		
		//close just close the active TAB
//		driver.close();
		
		//quit close the browser
		driver.quit();
	}

}
