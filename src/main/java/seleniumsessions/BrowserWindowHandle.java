package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserWindowHandle {
	
	 static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		String browserName = "chrome";

		BrowserUtil bUtil = new BrowserUtil();
		driver = bUtil.initDriver(browserName);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		By linkedin = By.xpath("//a[contains(@href,'linkedin')]");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doClick(linkedin);

		// driver.getWindowHandle(); // To get the ID of parent window
		Set<String> handles = driver.getWindowHandles(); // To get the ID of child windows (new window)
		Iterator<String> it = handles.iterator();
		
		String parentWindow = it.next();
		System.out.println(parentWindow);
		
		String childWindow = it.next();
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
	}

}
