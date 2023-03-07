package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	static WebDriver driver;
	
	
	public void handleDynamictext(String name) {
		driver.findElement(By.xpath("//input[contains(text(),'"+name+"')]")); //sample code
	}
	
	public static void main(String[] args)
	{
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// Another Approach
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//	    driver.findElement(email).sendKeys("Mahesh");
//		driver.findElement(pwd).sendKeys("admin");
		
//		// Another approach
//		By email = By.id("input-email");
//    	By pwd = By.id("input-password");
//    	
//    	getElement(email).sendKeys("Mahesh");
//    	getElement(pwd).sendKeys("123");
    	
    	// Another approach
		By email = By.id("input-email");
     	By pwd = By.id("input-password");
     	By loginbutton=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"); //relative xpath
     	
     	
    
		ElementUtil eutil = new ElementUtil(driver);
		eutil.doSendKeys(email, "Mahesh");
		eutil.doSendKeys(pwd, "123");
		eutil.doClick(loginbutton);
		 
		
	}
	
	
	


}
