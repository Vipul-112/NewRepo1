package BaseAction;

import org.openqa.selenium.WebElement;

import Bindings.Hooks;

public class PageAction extends Hooks{
	
	//Click
	public static void ClickOnElemenet(WebElement ele)
	{
		ele.click();
	}
	
	//Sendkeys
	public static void EnterText(WebElement ele, String text)
	{
		ele.sendKeys(text);
	}

}
