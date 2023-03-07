package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SVGElement {
	

    static WebDriver driver;
	
    static String browserName="chrome";

	public static void main(String[] args) throws InterruptedException {
		
		
	  BrowserUtil bUtil = new BrowserUtil();
	  driver=bUtil.initDriver(browserName);
	 
	  bUtil.getUrl("https://petdiseasealerts.org/forecast-map#/");
	  Thread.sleep(3000);
	  
	  
	  WebElement iFrameId = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
	  driver.switchTo().frame(iFrameId);
	  
	  String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g'and @id='regions']//*[name()='path']";
	  List<WebElement> svgList = driver.findElements(By.xpath(svgXpath));
	  for(WebElement e:svgList) {
		  String getAllStateNames = e.getAttribute("name");
		  System.out.println(getAllStateNames);
		  if(getAllStateNames.equals("Maryland")) {
			  e.click();
		  }
		  
	  }
	
	}
}
