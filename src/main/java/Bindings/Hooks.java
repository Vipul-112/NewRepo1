package Bindings;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	public static WebDriver driver;
	public static String URL="https://www.nykaa.com/";
	
	@io.cucumber.java.Before
	public void Start()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		System.out.println("Before Start ###");
	}

	@io.cucumber.java.After
	public void End()
	{
//		driver.quit();
		System.out.println("After Start ###");
	}
	
	

}
