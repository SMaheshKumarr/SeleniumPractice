package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.systeminfo.SystemInfo;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {
	
	

	public static void main(String[] args) {
		
		
		String browserName="Chrome";
		WebDriver driver=null;
		
//		if(browserName.equals("Chrome"))
//		{
//			driver=new ChromeDriver();
//		}
//		else if(browserName.equals("Firefox"))
//		{
//			driver=new FirefoxDriver();
//		}
//		else
//		{
//			System.out.println("Browser not supportable");
//		}
//		
		switch(browserName)
		{
		 case "Chrome":
		 {
			 driver=new ChromeDriver();
			 break;
		 }
		
		 case "Firefox":
		 {
			 driver=new FirefoxDriver();
			 break;
		 }
		 
		 default: System.out.println("Browser not supportable");
		 
			 
		}

		driver.get("https://www.google.com/");
		
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		
		

	}

}
