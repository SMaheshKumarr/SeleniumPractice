package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShadowDomConcept {
	
	
	public static WebDriver driver;
	
	static String browserName="chrome";
	
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil bUtil = new BrowserUtil();
		driver=bUtil.initDriver(browserName);
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement pizza = (WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
		System.out.println(pizza);
		pizza.sendKeys("vegPizza");
		
	}
	
	

}
