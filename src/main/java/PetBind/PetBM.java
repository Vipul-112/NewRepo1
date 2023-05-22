package PetBind;

import org.openqa.selenium.By;

import BDD.Hooks2;

public class PetBM extends Hooks2 {

	public static void start()
	{
		driver.findElement(By.linkText("Sign In")).click();
	}
	public static void UsernameAndPAssword(String string, String string2)
	{
		driver.findElement(By.name("username")).sendKeys(string);
    	driver.findElement(By.name("password")).sendKeys(string2);
	}
	 public static void loginbutton()
	 {
		 driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
	 }
}
