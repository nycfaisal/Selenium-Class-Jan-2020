import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuyLinkCount {
	
	public static void main (String [] args) //=========>come back later
	{
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		
		//limiting webdriver to mybestbuy
		WebElement mybestbuy = driver.findElement(By.xpath("//div[@class='primary-navigation']//div[1]//div[1]"));
		mybestbuy.findElement(By.xpath("//a[@class='heading-6']")).click();
	}

}
