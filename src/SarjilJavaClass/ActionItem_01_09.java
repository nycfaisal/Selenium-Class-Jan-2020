package SarjilJavaClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionItem_01_09 {
	
	public static void main (String[] args)
	{
	
	System.setProperty("webdriver.chrome.driver","//Users//faisalmohammad//Documents//chromedriver 2");
	WebDriver driver = new ChromeDriver();
	
	//retrieving URL
	driver.get("http://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//closing login message
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	
	//seachbar
	WebElement searchbar =driver.findElement(By.xpath("//input[@name='q']"));
	searchbar.sendKeys("mobile");
	searchbar.sendKeys(Keys.ENTER);
	
	//sliderbar
	WebElement Rsliderbar = driver.findElement(By.xpath("//div[@class='_3G9WVX _2N3EuE']//div[@class='_3aQU3C']"));
	WebElement Lsilderbar = driver.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']//div[@class='_3aQU3C']"));
	//WebDriverWait wait = new WebDriverWait(driver, 20);
	//wait.until(ExpectedConditions.elementToBeClickable(Rsliderbar));
	
	//actions
	Actions action = new Actions(driver);
	//action.dragAndDropBy(Rsliderbar, 102, 0).release().build().perform();
	//Rsliderbar.click();
	action.dragAndDropBy(Lsilderbar, 74, 2).release().build().perform();
	Lsilderbar.click();
	
	}
}


