package SarjilJavaClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("http:www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Array of element objects
		//Get input tag and store in List variable/obj number_of_hiddenelements
		List<WebElement> number_of_hiddenelements = driver.findElements(By.tagName("input"));
		//print total numbers of input tag
		System.out.println(number_of_hiddenelements.size());
		//get all hidden element text
		for (int i=0; i< number_of_hiddenelements.size(); i++)
		{	//check empty text
			if (number_of_hiddenelements.get(i).getAttribute("type").trim().equalsIgnoreCase("hidden"))
			{	
				if(!number_of_hiddenelements.get(i).getAttribute("value").trim().isEmpty())
				{
					System.out.println("hidden Element Text =" +i + " " + number_of_hiddenelements.get(i).getAttribute("value").trim());
				}
			}
		}
		
	}

}
