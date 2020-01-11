import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice {

	public static void main (String [] args) //---- comeback to get total run
	{
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sports.ndtv.com/cricket/live-scorecard/pakistan-vs-sri-lanka-1st-test-rawalpindi-pksl12112019193170");
		
		//limiting webdriver scope to table only
		
		List<WebElement> secondColumn = driver.findElements(By.xpath("//div[@id='inng_det_0']//div[1]//table[1]//tr//td[2]"));
		for (int i=0; i < secondColumn.size(); i++)
		{
			String run = secondColumn.get(i).getText();
			System.out.println(run);
		}
		System.out.println(driver.findElement(By.xpath("//td[text()='Extras']/following-sibling::td")).getText());
		
		
		
	driver.quit();	
	}
}
