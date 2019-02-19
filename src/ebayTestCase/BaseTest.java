package ebayTestCase;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	WebDriver driver;
	String expectedURL = ("https://www.ebay.com/");
	
	@BeforeClass
	public void beforeclass(){
		
		String Basedir = System.getProperty("user.dir");
		String ChormeDir = Basedir + ("\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ChormeDir);
		
	   driver = new ChromeDriver();
	}
     
	
	
	@BeforeMethod
	public void beforeMethod(){
		
		driver.get("https://www.ebay.com/");
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, expectedURL);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	

	@AfterMethod
	public void afterMethod(){
		System.out.println("testcase finished");
		
	}
	

	@AfterClass
	public void afterclass(){
		driver.close();
		
	}

	
	
	
}
