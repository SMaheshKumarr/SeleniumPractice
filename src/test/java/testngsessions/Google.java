package testngsessions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import seleniumsessions.BrowserUtil;

public class Google {
	
	WebDriver driver;
	//String browserName="chrome";
	
	@Parameters({"url","browser"})
	@BeforeTest
	public void openBrowser(String url,String browser) {
		
		BrowserUtil bUtil = new BrowserUtil();
		driver = bUtil.initDriver(browser);
		driver.get(url);
		
	}
	
	@Test
	public void action() {
		System.out.println("Test Method");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
