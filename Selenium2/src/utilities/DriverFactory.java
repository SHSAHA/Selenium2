package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	
	//This method will return WebDriver object

	public static WebDriver open(String browserType) {
		if (browserType.equalsIgnoreCase("Chrome")) {
			//code for Chrome
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaswata\\Downloads\\SeleniumProjects\\Software\\chromedriver.exe");
			 return new ChromeDriver();
		
		}
			
		else if (browserType.equalsIgnoreCase("IE")){
			//code for IE Driver
			System.setProperty("webdriver.ie.driver", "C:\\Users\\shaswata\\Downloads\\SeleniumProjects\\Software\\IEDriverServer.exe");
			 return new InternetExplorerDriver();
			 
		}
		else {
			//code for Firefox
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shaswata\\Downloads\\SeleniumProjects\\Software\\geckodriver.exe");
			 return new FirefoxDriver();
			
		}
	}

}
