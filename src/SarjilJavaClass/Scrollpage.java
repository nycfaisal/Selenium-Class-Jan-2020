package SarjilJavaClass;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrollpage {
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
		
		driver.get("https://djcity.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1 -- pixel --amazon
		js.executeScript("window.scrollby(0,500)", "");
		
		//2-using element  -djCity
		WebElement social = driver.findElement(By.xpath("//*[@id='footer']/div[2]/div[1]/div[1]/ul/li[1]/a"));
				js.executeScript("arugment[0].scrollintoView();",social);
				
		//3 - botton of the page --bestbuy.com
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
