package seleniumsessions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SelectTagDropDown {

	static String browserName="chrome";
	
	public static void main(String[] args) {
	
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver(browserName);
		brUtil.launchURL("https://www.orangehrm.com/orangehrm-30-day-trial");
		brUtil.getTitle();
		
		
		By country = By.id("Form_getForm_Country");
		

		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.getDropDownSize(country);
	    //eUtil.getDropDownOptionsListFromSelectType(country);
	   // eUtil.selectDropDownValue(country, "India");
	    
	   
	   
//	  List<String> exp_list = eUtil.getDropDownOptionsTextList(country);
//	  Collections.sort(exp_list);

	}

}
