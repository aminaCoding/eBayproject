package ebayTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//Scartch class to find the dropdown list

@Test
public class UserGetElementFromCategoryList extends BaseTest {
	

	public void getItem(){
		 
		Select itemList = new Select(driver.findElement(By.cssSelector("#gh-cat")));
		
		List<WebElement> mylist =  itemList.getOptions();
		
		System.out.println(mylist.size());
		
		
		for(WebElement list1:mylist){
			System.out.println(list1.getText());
		}
	}
	
	
	

}
