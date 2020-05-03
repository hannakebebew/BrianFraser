package hrmtestcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import End2End.OrangeHRM.base;

public class HomePage extends base{
	
	WebDriver driver;
	
	@Test 
	public void login() throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hanna\\Downloads\\webdrivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();	
		driver.get("https://www.facebook.com/");
		//driver.get(prop.getProperty("https://www.facebook.com/"));
		//driver.get("https://aaronunitedco-trials65101.orangehrmlive.com/auth/login");
		
	}

}
