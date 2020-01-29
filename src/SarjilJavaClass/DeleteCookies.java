package SarjilJavaClass;

import java.util.Set;


import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteCookies {
	
	WebDriver driver;
	@BeforeTest
	public void initializeDriver()
	{
		System.setProperty("webdriver.chrome.driver","//Users//faisalmohammad//Documents//chromedriver 2");
		driver = new ChromeDriver();
	}
	@Test
	public void noCookies()
	{
		
		driver.get("https://www.expedia.com/");
		//1 way 1 all cookies deletion
		driver.manage().deleteAllCookies();
		//2 way 2 deletion specific name cookies
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().deleteCookieNamed("");
		
		Set<Cookie> cookesstorage = driver.manage().getCookies();
		for(Cookie getcookies: cookesstorage)
		{
			System.out.println(getcookies);
		}
	}

}
