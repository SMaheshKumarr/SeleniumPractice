package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectCheckBox {
	
	static String browserName="chrome";

	public static void main(String[] args) {
		
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver(browserName);
		brUtil.launchURL("https://www.ironspider.ca/forms/checkradio.htm");
		brUtil.getTitle();
		
		
		
		By multipleCheckbox=By.name("color");
		//By singleCheckbox = By.xpath("//input[@value='red']");
        

		
		ElementUtil eUtil = new ElementUtil(driver);
	    eUtil.getCheckboxList(multipleCheckbox);
	   // eUtil.doClick(singleCheckbox);

	}

}
