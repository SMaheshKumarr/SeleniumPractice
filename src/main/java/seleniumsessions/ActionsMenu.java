package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

public class ActionsMenu {

	static WebDriver driver;

	static String browserName = "chrome";
	
	

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil bUtil = new BrowserUtil();
		driver = bUtil.initDriver(browserName);

		bUtil.getUrl("https://www.browserstack.com/guide/action-class-in-selenium");
		Thread.sleep(3000);

		//movetoelement
		WebElement menu = driver.findElement(By.xpath("//button[@id='developers-menu-toggle']"));
		Actions act = new Actions(driver);
		act.moveToElement(menu).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@title='Documentation' and @class='menu-item-documentation']")).click();
		
		//ELementNotInteracted can be solved Using SendKeys in Action Class
	        driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			By fn = By.id("input-firstname");
			By ln=By.id("input-lastname");
			By clickBtn=By.cssSelector("input[type='submit']");
		
			ElementUtil eUtil = new ElementUtil(driver);
			eUtil.doActionsSendKeys(fn, "Mahesh");
			eUtil.doActionsSendKeys(ln, "kumar");
			eUtil.doActionsClick(clickBtn);
			

	}

}
