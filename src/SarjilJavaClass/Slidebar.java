package SarjilJavaClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slidebar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://platerate.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement sliders = driver.findElement(By.xpath("//input[@name='range']"));
		//Action class allows you to do mouse and keyboard task/interaction
		Actions actions = new Actions(driver);
		//actions.dragAndDropBy(sliders, 150, 300).release().build().perform();
		
		actions.clickAndHold(sliders).moveByOffset(5, 5).release().build().perform();
		
		sliders.click();
		

	}

}
