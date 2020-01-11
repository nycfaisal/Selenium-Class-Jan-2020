import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssignment {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		
		//intantializing chromedriver
		WebDriver driver = new ChromeDriver();
		
		//get URL
		driver.get("http://qaclickacademy.com/practice.php");
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		Assert.assertFalse(checkbox1.isSelected());
		Thread.sleep(1000);
		checkbox1.click();
		Thread.sleep(1000);
		Assert.assertTrue(checkbox1.isSelected());
		checkbox1.click();
		Thread.sleep(1000);
		Assert.assertFalse(checkbox1.isSelected());
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Assert.assertEquals(checkbox.size(), 3);
		
		driver.quit();

	}

}
