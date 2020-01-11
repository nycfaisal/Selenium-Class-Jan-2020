import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class cleartripAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//calendar 
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		//select current date
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		//selecting adult passenger
		WebElement adult = driver.findElement(By.xpath("//select[@id='Adults']"));
		Select adults = new Select(adult);
		adults.selectByIndex(1);
		System.out.println(adults.getOptions().get(1));   //========> print statement
		//verify adults
		//Assert.assertEquals(adults.getOptions().get(1), 2); -------> how to do assertion
		
		//selecting children
		WebElement children = driver.findElement(By.xpath("//select[@id='Childrens']"));
		Select Children = new Select(children);
		Children.selectByIndex(1);
		
		//verify children
		//Assert.assertEquals(Children.getOptions().get(2), 2);
		
		//submit SearchFlights
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();;
		
		//get error message
		WebElement error = driver.findElement(By.xpath("//div[@id='homeErrorMessage']"));
		//verify error message
		Assert.assertEquals(error.getText(), "Sorry, but we can't continue until you fix everything that's marked in RED");
		
		//departure location
		WebElement depart = driver.findElement(By.xpath("//input[@id='FromTag']"));
		depart.click();
		Thread.sleep(1000);
		depart.sendKeys("new");
		Thread.sleep(1000);
		depart.sendKeys(Keys.ARROW_DOWN);
		depart.sendKeys(Keys.ENTER);
		
		WebElement arrival = driver.findElement(By.xpath(" //input[@id='ToTag']"));
		arrival.click();
		Thread.sleep(1000);
		arrival.sendKeys("dac");
		//Thread.sleep(1000);
		arrival.sendKeys(Keys.ENTER);
		//click calendar again
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		Thread.sleep(1000);
		//click search flights
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		
		driver.quit();

	}

}
