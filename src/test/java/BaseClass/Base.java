package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static String URL="https://www.irctc.co.in/nget/train-search";
	public static WebDriver driver;
 {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	
	
	driver.get(URL);
}
@AfterTest
public static void Close()
{
	driver.close();
}

}
