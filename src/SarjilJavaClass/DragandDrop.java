package SarjilJavaClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
	
	public WebDriver driver;
	@BeforeTest
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver","//Users//faisalmohammad//Documents//chromedriver 2");
		driver = new ChromeDriver();
	}
	@Test
	public void dragndrop()
	{
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//handling frame
		WebElement frameone = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameone);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(drag).moveToElement(drop).release().build().perform();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		driver = null;
	}

}
