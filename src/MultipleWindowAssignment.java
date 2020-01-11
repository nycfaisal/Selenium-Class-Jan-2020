import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowAssignment {
	
	public static void main(String [] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		
		driver.findElement(By.xpath("//div[@class='example'] //a[@target='_blank']")).click();
		
		//create window id
		Set<String> webId = driver.getWindowHandles();
		//create iterator ----> know more about iterator
		Iterator<String> webIds = webId.iterator();
		//create parent/child ids 
		String parentId = webIds.next();
		String childId = webIds.next();
		//switch to child Window and get text
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		//switch back to parent window and get text
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//div[@class='example'] //h3")).getText());
		
		driver.quit();
		
		
		
		
	}

}
