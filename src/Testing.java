import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testing {


			
			public static void main (String[] args)
			{
			
			System.setProperty("webdriver.chrome.driver","//Users//faisalmohammad//Documents//chromedriver 2");
			WebDriver driver = new ChromeDriver();
			
			//retrieving URL
			driver.get("https://www.flipkart.com/search?q=mobile&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=0&as-type=HISTORY&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3DMax");
			driver.manage().window().maximize();
			
			//seachbar
			//WebElement searchbar =driver.findElement(By.xpath("//input[@name='q']"));
			//searchbar.sendKeys("mobile");
			//searchbar.sendKeys(Keys.ENTER);
			
			//sliderbar
			WebElement Rsliderbar = driver.findElement(By.xpath("//div[@class='_3G9WVX _2N3EuE']//div[@class='_3aQU3C']"));
			//WebDriverWait wait = new WebDriverWait(driver, 10);
			//wait.until(ExpectedConditions.elementToBeClickable(Rsliderbar));
			
			//actions
			Actions action = new Actions(driver);
			action.dragAndDropBy(Rsliderbar, 109, 0).release().build().perform();;
			Rsliderbar.click();
			
			//driver.quit();
			
			}
		}
		
	


