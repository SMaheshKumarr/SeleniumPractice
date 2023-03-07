package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertJSPopup {
	
    static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		String browserName="chrome";
		
		BrowserUtil bUtil=new BrowserUtil();
		driver=bUtil.initDriver(browserName);
		
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.findElement(By.xpath("//input[@name='proceed']")).click();
	    
	    Thread.sleep(3000);
	    Alert alert = driver.switchTo().alert();
	    String AlertText = alert.getText();
	    System.out.println(AlertText);
	    if(AlertText.equals("Please enter a valid user name")) {
	       alert.accept();
	    }
	    
	    // For Confirm Popup
	    // alert.dismiss();
	    
	    // For Prompt PopUp
	    // alert.sendKeys("Mahesh")
	    
	    
	 
		

	}

}
