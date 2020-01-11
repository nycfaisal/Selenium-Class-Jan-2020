package SarjilJavaClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicityVExplicitW {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//implictywait is always applied globally -- for all the webelement 
		//present in the script
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement forgotLink = driver.findElement(By.linkText("Forgot account?"));
		
		
		SendKeys(driver, FirstName, 10, "Ali");
		SendKeys(driver, LastName, 20, "Test");
		clickOn(driver, forgotLink, 3);

	}
	public static void SendKeys (WebDriver driver, WebElement locators, int timeout, String value)
	{	//explicit wait(WebDriverWait) doesn't have any command like implicit wait that indicates 
		//it's an explicit wait.
		//(WebDriverWait) is used for explicit wait.
		//Waits for particular element or action to take place. it's condition base
		//it must have a condition****
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(locators));
		locators.sendKeys(value);
	}
	
	public static void clickOn (WebDriver driver, WebElement element, int timeout)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
}
