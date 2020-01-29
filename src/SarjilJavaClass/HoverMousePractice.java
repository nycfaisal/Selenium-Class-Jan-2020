package SarjilJavaClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverMousePractice {
	
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","//Users//faisalmohammad//Documents//chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Mortgage Calcs')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'10 yr Fixed')]")).click();
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		driver = null;
		
	}

}
