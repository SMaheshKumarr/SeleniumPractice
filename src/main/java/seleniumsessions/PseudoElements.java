package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PseudoElements {

	static WebDriver driver;

	static String browserName = "chrome";
	
	static String getAttrName,mand_field,allFields,propertyValue;
	

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil bUtil = new BrowserUtil();
		driver = bUtil.initDriver(browserName);

		bUtil.getUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(3000);
	  
		List<WebElement> getFieldNames = driver.findElements(By.xpath("//label[contains(@for,'input-')]"));
		for(WebElement e:getFieldNames) {
			
			allFields = e.getText();
			propertyValue=e.getAttribute("for");
			//System.out.println(allFields);
			
			JavascriptExecutor js =(JavascriptExecutor)driver;
			String scripttoFindMandSymbol = "return window.getComputedStyle(document.querySelector(\"label[for='"+propertyValue+"']\"),'::before').getPropertyValue('content')";
		    mand_field = js.executeScript(scripttoFindMandSymbol).toString();
			//System.out.println(mand_field);
			if(mand_field.contains("* ")) {
				System.out.println(allFields + " : " + "is a mandatory field");
				}	
				
		}
		
		
		
		
		
		
		
		

		}
}
