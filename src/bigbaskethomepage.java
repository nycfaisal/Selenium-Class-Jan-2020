import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bigbaskethomepage {

	public static void main(String[] args) {
		//come back to this for further modification
		
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/cl/fruits-vegetables/#!page=2");
		
		//initialize a count variable
		int j = 0;
		
		//list of products to addToCart
		String [] product = {"Cauliflower", "Palak", "Carrot"};
		
		//Webelement of names of product
		List<WebElement> name = driver.findElements(By.xpath("//a[@class='ng-binding']"));
		
		//create a for loop to go through each element
		for (int i=0; i<name.size(); i++)
		{
			//get text from each index
			String name1 = name.get(i).getText();
			
			//get only the name of product
			String [] finalProduct = name1.split("-");
			String productName = finalProduct[0].trim();
			
			//convert array to arraylist
			List<String> checklist = Arrays.asList(product);
			
			//comparing product
			if (checklist.contains(productName))
			{
				//addtocart
				driver.findElements(By.xpath("//div[@class='col-sm-5 col-xs-5 pad-0']//button")).get(i).click();
				j++;
				if (j<=product.length)
					break;
			}
		}
}
}