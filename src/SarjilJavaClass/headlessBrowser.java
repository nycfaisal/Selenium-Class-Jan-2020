package SarjilJavaClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessBrowser {

	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","//Users//faisalmohammad//Documents//chromedriver 2");
		ChromeOptions opt = new ChromeOptions();
		opt.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("http://www.facebook.com");
		
		System.out.println("Title page: " + driver.getTitle());
	}
}
