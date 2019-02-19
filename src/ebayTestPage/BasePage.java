package ebayTestPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	WebDriver driver; //( globally call it here )
	
   

	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.initpage();
	}

	private void initpage() {
		// TODO Auto-generated method stub
		PageFactory.initElements(driver, this);
	}
}
