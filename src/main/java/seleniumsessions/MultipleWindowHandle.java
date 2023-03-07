package seleniumsessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowHandle {

	static WebDriver driver;
	
	  public static boolean switchToRightWindow(String windowTitle, List<String> hList) {
		    for(String e : hList) {
		    	String title = driver.switchTo().window(e).getTitle();
		    	System.out.println(title);
		    	//switch to facebook window
		    	if(title.contains(windowTitle)) {
		    		System.out.println("Found the right window"+windowTitle);
		    		return true;
		    	}
		    }
		    return false;
	  }

	public static void main(String[] args) throws InterruptedException {

		String browserName = "chrome";

		BrowserUtil bUtil = new BrowserUtil();
		driver = bUtil.initDriver(browserName);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindow = driver.getWindowHandle();

		Thread.sleep(3000);

		By linkedin = By.xpath("//a[contains(@href,'linkedin')]");
		By facebook = By.xpath("//a[contains(@href,'facebook')]");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doClick(linkedin);
		eUtil.doClick(facebook);

		
		Set<String> childHandles = driver.getWindowHandles();
	    List<String> hList = new ArrayList<>(childHandles);
	    System.out.println(hList.size());
	    
	   if(switchToRightWindow("HRIS", hList)) {
		   
	   }
	    		
	    }
	    	
		//Note:random popup cant be handled in selenium

	}


