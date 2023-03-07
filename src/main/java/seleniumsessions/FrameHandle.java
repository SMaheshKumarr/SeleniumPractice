package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameHandle {

	static WebDriver driver;

	public static void main(String[] args) {
		
		String browserName = "chrome";

		BrowserUtil bUtil = new BrowserUtil();
		driver = bUtil.initDriver(browserName);
		
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
	//	driver.switchTo().frame(2);
		
	//	driver.switchTo().frame("main");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));

		
		String getText = driver.findElement(By.tagName("h2")).getText();
		System.out.println(getText);
		
		driver.switchTo().defaultContent();
	}

}
