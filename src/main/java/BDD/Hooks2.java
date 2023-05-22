package BDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks2 {
	public static String URL = "https://petstore.octoperf.com";

	public static Actions act;

	public static WebDriver driver;

	@Before

	public static void Start() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		act = new Actions(driver);

		driver.manage().window().maximize();

		driver.get(URL);

	}

	@After

	public static void End() {

		driver.quit();

	}

}
