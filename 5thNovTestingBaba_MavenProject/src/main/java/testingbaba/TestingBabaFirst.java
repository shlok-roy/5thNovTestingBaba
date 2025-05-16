package testingbaba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingBabaFirst {
	
	@Test
	public void launchurl()
	{
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://testingbaba.com/old");
	}
}
