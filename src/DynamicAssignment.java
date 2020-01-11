import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DynamicAssignment {
	
	private static final boolean True = false;

	public static void main (String [] arg)
	{
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		//select checkbox
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		//print options3
		System.out.println(driver.findElement(By.xpath("//label[@for='honda']")).getText());
		String statement = driver.findElement(By.xpath("//label[@for='honda']")).getText();
		
		//select option 3 based on dynamic
		WebElement selection = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select dropdown = new Select(selection);
		dropdown.selectByVisibleText(statement);
		
		//switch to alert statement
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(statement);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		//Verifying presence of text from alert statement
		String alertStatement = driver.switchTo().alert().getText();
		System.out.println(alertStatement);
		
		if (alertStatement.contains(statement)) //-------- COMEBACK to solution video and verify again
		{
			Assert.assertTrue(True);
		}
		
		
		//alternative method of verification
		String [] arrayAS = alertStatement.split(",");
		
		//going through each array
		for (int i=0; i<arrayAS.length; i++)
		{
			String [] finalArray = arrayAS[i].split(" ");
			
			for (int j=0; j<finalArray.length; j++)
			{
				if (finalArray[j].equals(statement))
				{
					Assert.assertEquals(finalArray[j], "Option3");
				}
			}
			
		}
		
		
		driver.quit();
	}

}
