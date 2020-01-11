import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountPractice {

	public static void main (String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php#top");
		
		
		
		//limit webdriver scope to footer
		WebElement footercolumn = driver.findElement(By.xpath("//div[@id='gf-BIG']//tr//td[1]//ul"));
		
		List<WebElement> weblinks = footercolumn.findElements(By.tagName("a"));
		
		for (int i = 0; i<weblinks.size(); i++)
		{
			String clickontab = Keys.chord(Keys.COMMAND, Keys.ENTER);
			weblinks.get(i).sendKeys(clickontab);
			Thread.sleep(5000);
		}
		Iterator<String> windows = driver.getWindowHandles().iterator();
		
		while (windows.hasNext())
		{
			driver.switchTo().window(windows.next());
			System.out.println(driver.getTitle());
		}
	}
}
