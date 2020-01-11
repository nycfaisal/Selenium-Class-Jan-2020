import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {
	
	public static void main (String [] arg)
	{
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		//click on the link
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		
		//switching to designamted frame
		//WebElement parentFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));  --->why not working with xpath?
		//WebElement middleFrame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame("frame-top").switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		//switch back to website
		driver.switchTo().defaultContent();
		
		driver.quit();
	}

}
