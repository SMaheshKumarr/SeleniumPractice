package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task {
	
	
	private static By checkbox = By.xpath("//span[text()='Add to Compare']/parent::label/preceding-sibling::span//child::div[@class='_24_Dny']");
	private static By MobileModel = By.cssSelector("div._4rR01T");
	private static String browserName="chrome";
    private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.initDriver(browserName);
		brUtil.launchURL("https://www.flipkart.com/search?q=mobile+phone&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_6_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_6_na_na_na&as-pos=2&as-type=RECENT&suggestionId=mobile+phone%7CMobiles&requestId=b3115998-dcdf-4732-8ece-07be0149045d&as-searchtext=mobile");
		brUtil.getTitle();
		
		
		
		
		
		ElementUtil eUtil = new ElementUtil(driver);
	  //  eUtil.getCheckboxList(multipleCheckbox);
	   // eUtil.doClick(singleCheckbox);
		
		List<WebElement> allMobiles = eUtil.waitForElementsVisible(MobileModel, 10);
		
		for(WebElement e:allMobiles) {
			String mobileNameList=e.getText();
			if(mobileNameList.contains("SAMSUNG Galaxy F04") || mobileNameList.contains("REDMI 10")) {
				Thread.sleep(3000);
				WebElement eleFound = eUtil.waitForElementVisibilityUsingFluentWait(20, 20, checkbox);
				eleFound.click();
			}
			
			
			
		}
	}
}