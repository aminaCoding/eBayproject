package ebayTestPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomepage extends BasePage {
	
	//to call the base page created consturctor

	public EbayHomepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css="#gh-ac")public WebElement searchbox ; //find element and initialize the element
	public WebElement getSearchBox(){  //create return type method for the elemnt
		return searchbox;
	}
	
	@FindBy(css="#gh-btn")public WebElement searchIcon;
	public WebElement getSearchIcon(){
		return searchIcon;
	}
	
	@FindBy(css="#gh-cat")public WebElement category;
	   public WebElement getCategory(){
		   return category;
	   }
	
}
