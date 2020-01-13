package SarjilJavaClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DateSel {
	WebDriver driver;
	@BeforeTest
	public void launchingBrowser(){
	System.setProperty("webdriver.chrome.driver","//Users//faisalmohammad//Documents//chromedriver 2");
	driver = new ChromeDriver();
	driver.get("https://www.expedia.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
	public void calender()
	{
		driver.findElement(By.xpath("//*[id='tab-hotel-tab-hp']")).click();
		
		String mon = "Mar 2020";
		String day = "20";
		
		driver.findElement(By.xpath("//*[@id='hotel-checkin-hp-hotel']")).click();
		
		while(true)
		{
			String text = driver.findElement(By.xpath("//caption")).getText();
			//text = Mar 2020 but when i open the calender if i don't see Mar 2020
			if(text.equals(mon))
			{
				break;
			}
			
			else
			{
				driver.findElement(By.xpath("//*[@id='package-departing-wrapper-hp-package']/div/div/button[2]")).click();
			}
			List<WebElement> allCalDate = driver.findElements(By.xpath("//*[@id='package-departing-wrapper-hp-package']/div/div/div[3]/table/tbody/tr/td/button"));
			for(WebElement elem: allCalDate)
			{
				System.out.println(elem.getText());
			}
		}
	}

}
