package SarjilJavaClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JetdotcomImageCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//
		
		List<WebElement> image = driver.findElements(By.tagName("img"));
		System.out.println(image.size());
		
		for (int i=0; i<image.size(); i++)
		{
			System.out.println(image.get(i).getAttribute("src"));
			System.out.println();
		}
		driver.quit();

	}

}
