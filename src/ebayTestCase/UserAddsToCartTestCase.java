package ebayTestCase;

import org.testng.annotations.Test;

import ebayTestPage.AddToCartPage;
import ebayTestPage.EbayHomepage;
import ebayTestPage.LadiesWatchesPage;

public class UserAddsToCartTestCase extends BaseTest{
	@Test
	public void addsToCart() throws InterruptedException{   //created the objects
		EbayHomepage ehp = new EbayHomepage(driver);
		LadiesWatchesPage lwp = new LadiesWatchesPage(driver);
		AddToCartPage acp = new AddToCartPage(driver);
		
		ehp.getSearchBox().sendKeys("ladies watches"); //call only methd
		ehp.getSearchIcon().click();
		lwp.getShopnow().click();
		acp.shoppingCart().click();
		Thread.sleep(2000);
	}
	

}
