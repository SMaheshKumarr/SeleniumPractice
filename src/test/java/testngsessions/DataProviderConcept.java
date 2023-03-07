package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import seleniumsessions.BrowserUtil;

public class DataProviderConcept {

	private static WebDriver driver;
	String browserName = "chrome";
	By email = By.id("input-email");
	By password = By.id("input-password");
	By loginButton = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");

	@BeforeClass
	public void LaunchBrowser() {
		BrowserUtil bUtil = new BrowserUtil();
		driver = bUtil.initDriver(browserName);
		bUtil.getUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	@DataProvider
	public Object[][] negativeTestCases() {
		return new Object[][] { 
			
			{ "abc@gmail.com", "abc11" }, 
			{ "cde@gmail.com", "efre" },

		};
	}

	@Test(dataProvider = "negativeTestCases")
	public void LoginTest(String username, String password) {
		boolean flag = doLogin(username, password);
		System.out.println(flag);
		Assert.assertTrue(flag);
	}

	@Test
	public boolean doLogin(String username, String Password) {

		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(username);
		
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(Password);
	
		driver.findElement(loginButton).click();
		
		String errorMsg = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		if (errorMsg.contains("No match for E-Mail Address and/or Password")) {
			return true;
		} 
			return false;
		
	}

	@AfterClass
	public void terminate() {
		driver.quit();
	}

}
