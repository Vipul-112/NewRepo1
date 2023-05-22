package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseAction.PageAction;
import Bindings.Hooks;

public class Nykaahomepage extends Hooks {
	
	
	
	
	//Locators
	public static WebElement  SearchArea=driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']"));
	
	
	//Related Actions
	public static void ClickAndEnterTextInSearchArea( String dataForSearch)
	{
		PageAction.ClickOnElemenet(SearchArea);
		PageAction.EnterText(SearchArea, dataForSearch);
	}

}
