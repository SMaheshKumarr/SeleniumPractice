package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.opentelemetry.api.logs.Logger;

public class Login {

	public static void main(String[] args) {
	
		//Launch Browser
		String browserName= "chrome";
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver(browserName);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brUtil.getTitle();
		
		//Login Locators
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		By loginButton = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
		
		//Calling Element and passing input values
		ElementUtil eutil = new ElementUtil(driver);
		eutil.doSendKeys(email, "mahesh@test.com");
		eutil.doSendKeys(pwd, "testaccount");
		eutil.doGetElementsAttributes(pwd, "id");
		//System.out.println(getpwdId);
		eutil.doClick(loginButton);
		
		brUtil.getTitle();
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(Login.class.getName());
        
        
	}

}
