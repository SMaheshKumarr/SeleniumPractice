package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {
	
	
	public static void main(String[] args) {
		
		String browserName= "chrome";
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver(browserName);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		brUtil.getTitle();
		
		//Registration
		
		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By pwdconfirm = By.id("input-confirm");
		By privacyCheckbox = By.name("agree");
		By continueButton = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		ElementUtil eutil = new ElementUtil(driver);
		eutil.doSendKeys(fname, "Mahesh");
		eutil.doSendKeys(lname, "Kumar");
		eutil.doSendKeys(email, "mahesh@test.com");
		eutil.doSendKeys(telephone, "9191919191");
		eutil.doSendKeys(pwd, "testaccount");
		eutil.doSendKeys(pwdconfirm, "testaccount");
		eutil.doClick(privacyCheckbox);
		eutil.doClick(continueButton);
		
		//Logo Image Verification
		By logoImage = By.className("img-responsive");
		if(eutil.doElementIsDisplayed(logoImage)) {
			System.out.println("Image is displayed");
		}
		else {
			System.out.println("Image is not displayed");
		}
		
		
		
		
	}
	
	
	
	

}
