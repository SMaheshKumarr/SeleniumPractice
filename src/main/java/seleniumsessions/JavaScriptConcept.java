package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptConcept {

	static WebDriver driver;

	static String browserName = "chrome";

	public static void main(String[] args) throws InterruptedException {
		
		
	  BrowserUtil bUtil = new BrowserUtil();
	  driver=bUtil.initDriver(browserName);
	 
	  bUtil.getUrl("https://www.amazon.in/");
	  Thread.sleep(3000);
	  
	 WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),'Today’s Deals')]"));
	 JavascriptUtil jsUtil = new JavascriptUtil(driver);
	 jsUtil.scrollIntoView(ele);
	}
}
