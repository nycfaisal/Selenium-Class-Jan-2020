package SarjilJavaClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderbarPractice {

	public static void main (String [] args){
	System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement Rslider = driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all'][1]"));
	Actions action = new Actions(driver);
	action.dragAndDropBy(Rslider, 105, 5).release().build().perform();
	Rslider.click();
	
	
}
}
