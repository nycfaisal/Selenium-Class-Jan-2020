import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableAssignment {
	
	public static void main (String [] arg)
	{
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		//limit webdriver scope to table only
		WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
		//table of rows
		List<WebElement> tableofrows = table.findElements(By.tagName("tr"));
		//count # of rows
		int numberofrows = tableofrows.size();
		System.out.println(numberofrows);
		
		//count number of column
		List<WebElement> tableofcolumn = tableofrows.get(0).findElements(By.tagName("th"));
		int numberofcolumn = tableofcolumn.size();
		System.out.println(numberofcolumn);
		
		//get text of 2nd row
		String textofsecondrow = tableofrows.get(2).getText();
		System.out.println(textofsecondrow);
		
		
		driver.quit();
		
		
	}

}
