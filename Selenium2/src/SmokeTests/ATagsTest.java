package SmokeTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATagsTest {
	
	WebDriver driver;
	String browserType = "Chrome";
	
  @Test
  public void aTagsLinksTest() {
	//Web Driver defined
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaswata\\Downloads\\New folder\\Selenium2\\Software\\chromedriver.exe");
			
			//Running Test
			System.out.println("Running Test");
			boolean privacypolicyPresent = false;
			
			//Testing the presence of hyperlinks
			List <WebElement> aElements = driver.findElements(By.tagName("a"));
			
			int numberofAElements = aElements.size();
			System.out.println("There are " + numberofAElements + " A tags on the page" );
			
			for (WebElement aElement : aElements) {
				System.out.println(aElement.getText());
				if(aElement.getText().equals("privacy policy")) {
					privacypolicyPresent = true;
					break;
					
				}
			}
			
			//Assertion
			Assert.assertTrue(privacypolicyPresent);
		
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
		
	