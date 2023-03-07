package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorConcept {
	
    static WebDriver driver;
	
    static String browserName="chrome";

	public static void main(String[] args) throws InterruptedException {
		
		
	  BrowserUtil bUtil = new BrowserUtil();
	  driver=bUtil.initDriver(browserName);
	 
	  bUtil.getUrl("https://www.aqi.in/dashboard/canada");
	  Thread.sleep(3000);
	  
	  WebElement canada = driver.findElement(By.linkText("Estevan, Canada"));
	  
	 
	  String rightIndex = driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(canada)).getText();
	  System.out.println(rightIndex);

	  String leftIndex = driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(canada)).getText();
	  System.out.println(leftIndex);
	  
	  String aboveIndex = driver.findElement(RelativeLocator.with(By.tagName("p")).above(canada)).getText();
	  System.out.println(aboveIndex);
	  
	  String belowIndex = driver.findElement(RelativeLocator.with(By.tagName("p")).below(canada)).getText();
	  System.out.println(belowIndex);
	}

}
