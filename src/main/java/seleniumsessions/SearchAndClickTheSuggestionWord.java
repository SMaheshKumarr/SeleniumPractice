package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchAndClickTheSuggestionWord {

	static String browserName="chrome";
	
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver(browserName);
		brUtil.launchURL("https://www.google.com/");
		brUtil.getTitle();
		
		
		By enterText = By.name("q");
		
		
		By suggestionWords = By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys(enterText,"selenium");
		Thread.sleep(3000);
		eUtil.searchTheSuggestionWord(suggestionWords, "selenium");

	}

}
