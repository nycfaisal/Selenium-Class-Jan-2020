import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoCompleteDropdownAssignment {

	public static void main (String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 5);
		//initializing variable
		int i = 0;
		
		//finding and clicking to autosuggestive web-edit
		WebElement autoDropdown = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		autoDropdown.click();
		//type unite for autobox table to display
		autoDropdown.sendKeys("Unite");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']")));
		
		//create javascriptExecutor object and get text
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script); //----->why i cast String
		
		//create while loop for verification of country
		while(!text.equalsIgnoreCase("united kingdom"))
		{
			autoDropdown.sendKeys(Keys.ARROW_DOWN);
			text = (String) js.executeScript(script);
			i++;
			
			if (i>13)
			{
				break;
			}
		}
		autoDropdown.sendKeys(Keys.ENTER);
		System.out.println(text);
		 
		driver.quit();
		
		
	}
}
	