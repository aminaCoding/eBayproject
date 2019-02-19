package ebayTestPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LadiesWatchesPage extends BasePage {

	public LadiesWatchesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css="#w4 > a > div > div.srp-1p__details > div.srp-1p__ad-column > div.srp-1p__cta > div")
	public WebElement shopnow;
	
	public WebElement getShopnow(){
		return shopnow;
	}

}
