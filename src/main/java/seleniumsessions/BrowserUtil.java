package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	/**
	 * 
	 */
	
	private WebDriver driver; // Default value of this driver is null
	
	
	public WebDriver initDriver(String browserName)
	
	{
		System.out.println("browserName is:" + browserName);
		
		switch(browserName.toLowerCase().trim())
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;
			
		default:
			System.out.println("browserName is not valid" + browserName);
			break;
			
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public void getUrl(String Url) {
		driver.get(Url);
		System.out.println("Url Launched");
	}
	
	public void launchURL(String url) {
		
     if(url==null) {
    	 System.out.println("URL cannot be null");
     }
     
     if(url.indexOf("https")==0){
    	 driver.get(url);
     }
		
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		System.out.println("pageTitle is:"+title);
		return title;
	}
	

	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("page current url is:"+ url);
		return url;
	}
	
	
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
		}
	}
	

}
