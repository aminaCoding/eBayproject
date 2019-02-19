package ebayTestPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage {

	public AddToCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
@FindBy(css="#gh-cart-i")public WebElement shoppingCart;

public WebElement shoppingCart(){
	return shoppingCart;
}
}
