package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	
	static WebDriver driver;

	static String browserName = "chrome";
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		By loginButton = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver(browserName);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brUtil.getTitle();
		
		ElementUtil eutil = new ElementUtil(driver);
		eutil.waitForElementPresenceUsingSendkeys(email, 10, "mahesh@test.com");
		eutil.doSendKeys(pwd, "testaccount");
		eutil.doClick(loginButton);
	}

}
