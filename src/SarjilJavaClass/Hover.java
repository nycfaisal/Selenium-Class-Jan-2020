package SarjilJavaClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hover {
	public WebDriver driver;
	@BeforeTest
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver","//Users//faisalmohammad//Documents//chromedriver 2");
		driver = new ChromeDriver();

	}
	@Test
	public void hoverMouse()
	{
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Mortgage Calcs')]"))).build().perform();
	}
}
