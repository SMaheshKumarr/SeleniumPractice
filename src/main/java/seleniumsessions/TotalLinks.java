package seleniumsessions;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TotalLinks {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//Launch Browser
		String browserName= "chrome";
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver(browserName);
		brUtil.launchURL("https://amazon.com");
		brUtil.getTitle();
		
		//Link Finder
		By linkfinder = By.tagName("a");
		
		ElementUtil eutil = new ElementUtil(driver);
		//List<WebElement> allLinks = eutil.getElements(linkfinder);
		
	    eutil.getTotalElementsCount(linkfinder);
	    eutil.doGetElementsAttributes(linkfinder, "href");
	    eutil.doGetElementsTextList(linkfinder);
		
		
		
		//int LinkCount = allLinks.size();
		//System.out.println("Total Links:"+ LinkCount);
		
		
//	for(int i=0;i<LinkCount;i++) {
//		   String text = allLinks.get(i).getText();
//		   if(text.length()==0) {
//		   System.out.println(i+ ":" +text);
//		   }
//		   else if(text.length()>0)
//		   {
//			   System.out.println("Valid Links" + i + ":" +text);
//		   }
//	}
	
	
//	int count=0;
//	for(WebElement e: allLinks) {
//		
//		String hrefLink = e.getAttribute("href");
//		String linkText = e.getText();
//		
//		//if(linkText.length()>0) {
//			System.out.println(count + " : " +hrefLink + " --> " + linkText);
//			
//		//}
//		count++;
//	}
//	

}
}
