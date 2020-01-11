import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytripHomepage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		
		//intantializing chromedriver
		WebDriver driver = new ChromeDriver();
		
		//get URL
		driver.get("https://www.makemytrip.com");
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin'] //input[@type='text']"));
		source.clear();
		source.sendKeys("New");
		Thread.sleep(2000);
		for (int i=1; i<=2; i++){
		source.sendKeys(Keys.ARROW_DOWN);
		}
		source.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//input[@id='toCity']")).click();
		//Thread.sleep(2000);
		WebElement destination = driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin'] //input[@type='text']"));
		destination.click();
		destination.clear();
		destination.sendKeys("Dac");
		Thread.sleep(2000);
		destination.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driver.close();

	}

}
