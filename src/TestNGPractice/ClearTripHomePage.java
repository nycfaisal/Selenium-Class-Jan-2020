package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClearTripHomePage {
	 WebDriver driver;

	@BeforeTest
	public void webdriver()
	{
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		this.driver = new ChromeDriver();
	}
	@Test
	public void URL ()
	{
		driver.get("https://www.facebook.com");
	}
	@Test
	public void validate()
	{
		Assert.assertFalse (driver.getTitle().equals("www.google.com"), "this is wrong title");
	}
	
	

}
