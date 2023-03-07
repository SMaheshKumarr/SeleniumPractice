package seleniumsessions;

import org.openqa.selenium.WebDriver;

public class AuthPopUp {

	static WebDriver driver;

	public static void main(String[] args) {

		String browserName = "chrome";
		
		String username="admin";
		String password="admin";

		BrowserUtil bUtil = new BrowserUtil();
		driver = bUtil.initDriver(browserName);
		
		// driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		

	}

}
