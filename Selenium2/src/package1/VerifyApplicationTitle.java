package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class VerifyApplicationTitle {
	
	WebDriver driver;
	String browserType = "Chrome";
	@Test
	public void verifyTitle() {
		
		//Web Driver defined
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaswata\\Downloads\\New folder\\Selenium2\\Software\\chromedriver.exe");
		
		//Running Test
		System.out.println("Running Test");
		
		String PageTitle = driver.getTitle();
		System.out.println("PageTitle :"+ PageTitle);
		
		String expected_title = "Sign up and start using";
		
		Assert.assertEquals(PageTitle, expected_title);
		//Assert.assertTrue(PageTitle.contains("Insly"));
		//System.out.println("Page title verified");
	
	}
	// Open browser and navigate to page
    @BeforeMethod
	public void setUp() {
    	System.out.println("Starting Test");
		driver = utilities.DriverFactory.open(browserType);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String webUrl = "https://signup.int.staging.insly.training/signup";
		driver.get(webUrl);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Closing Test");
		driver.close();
	}
	
	}
	


