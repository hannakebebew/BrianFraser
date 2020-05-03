package End2End.OrangeHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public static WebDriver driver; 
	public static Properties prop; 
	
	public static WebDriver initializeBrowser() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\hanna\\eclipse\\OrangeHRM\\src\\main\\java\\data.properties");
		prop = new Properties();
		prop.load(fis);
		String BrowserType= prop.getProperty("browser");
		
		if(BrowserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hanna\\Downloads\\webdrivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
					
		}
		if(BrowserType=="FireFox") {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\hanna\\Downloads\\webdrivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		if(BrowserType=="IE"){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\hanna\\Downloads\\webdrivers\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver; 
	}

}
