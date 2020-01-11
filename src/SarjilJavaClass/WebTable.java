package SarjilJavaClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main (String [] args) 
	{
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//table[@class='zebra fw tb-theme']"));
		//get the rows tagname
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int length = rows.size();
		//List<WebElement> column = table.findElements(By.tagName("td"));
		
		//int length2 = column.size();
		//System.out.println(length + " " + length2);
		/*for (int i =0; i<length; i++)
		{
			for (int j=0; j<column.size(); j++)
			{
			System.out.println(column.get(j).getText());
			
			}
		}*/
		//increment rows
		for (int i=0; i<rows.size(); i++)
		{
			//finding column tagname
			List<WebElement> column = rows.get(i).findElements(By.tagName("td"));
			//will go through every single row and column grab their values
			for(int j=0; j<column.size(); j++)
			{
				System.out.println(column.get(j).getText());
			}
			System.out.println();
		}

		driver.quit();
}
}
