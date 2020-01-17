package SarjilJavaClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Q5. Create a program which will allow you to get all the values in a calendar? 1 or 2 months date
public class ActionItem01_16 {
	
	WebDriver driver;
	
	@BeforeTest
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public void calValue ()
	{
		String mon = "Apr 2020";
		String text = "";
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		//clicking the calender
		driver.findElement(By.xpath("//*[@id='package-departing-hp-package']")).click();
		
		
		while(!text.equalsIgnoreCase(mon))
		{
			//capturing text of the month
			text =driver.findElement(By.xpath("//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']/following-sibling::div[2]//caption")).getText();
			
			//click on the arrow button
			driver.findElement(By.xpath("//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']")).click();
			
			
		}
		//limt driver to table
		WebElement table = driver.findElement(By.xpath("//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']/following-sibling::div[2]//tbody"));
		//find all rows
		List<WebElement>rows = table.findElements(By.tagName("tr"));
		//go through each rows
		for (int i=0; i<rows.size(); i++)
		{	//get list of columns in each row
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			//go through each column and grab value
			for (int j=0; j<col.size(); j++)
			{
				System.out.println(col.get(j).getText());
			}
		}
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		driver = null;
	}

}
