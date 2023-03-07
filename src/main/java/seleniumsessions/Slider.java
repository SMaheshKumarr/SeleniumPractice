package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	static WebDriver driver;

	static String browserName = "chrome";

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil bUtil = new BrowserUtil();
		driver = bUtil.initDriver(browserName);

		bUtil.getUrl("https://jqueryui.com/resources/demos/slider/default.html");
		
		WebElement slider = driver.findElement(By.id("slider"));
		Actions act=new Actions(driver);
		
		int width = slider.getSize().getWidth();
		int height=slider.getSize().getHeight();
		
		//act.moveToElement(slider).click().build().perform();
		
		//act.moveToElement(slider, (width/2)-40, 0).click().build().perform(); // moves to right direction
		
		act.moveToElement(slider, -((width/2)-40), 0).click().build().perform(); // moves to left direction
	}
}