import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FacebookSignupPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//set chromedriver 
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		//intantiate webdriver
		WebDriver driver = new ChromeDriver();
		//open facebook
		driver.get("https://www.facebook.com/");
		
		//email,password, login and back to navigation
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("larissa@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("easypassword");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0')]")).click();
		//navigate back
		Thread.sleep(2000);
		driver.navigate().back();
		
		//filling up personal information for sign up
		
		driver.findElement(By.xpath("//input[@id='u_0_f']")).sendKeys("Larissa");
		driver.findElement(By.xpath("//input[@id='u_0_h']")).sendKeys("Mohammad");
		driver.findElement(By.xpath("//input[@id='u_0_k']")).sendKeys("347-784-3456");
		driver.findElement(By.xpath("//input[@id='u_0_p']")).sendKeys("newpassword2019");
		
		WebElement melement = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(melement);
		month.selectByVisibleText("Apr");
		
		WebElement delement = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(delement);
		day.selectByIndex(28);
		
		WebElement yelement = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(yelement);
		year.selectByValue("2003");
		
		//select Gender
		
		//female
		WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
		//varifying checkbox is empty
		Assert.assertFalse(female.isSelected());
		//clicked on checkbox
		female.click();
		//varifying checkbox is clicked
		Assert.assertTrue(female.isSelected());
		Thread.sleep(1000);
		//male
		WebElement male =  driver.findElement(By.xpath("//input[@value='2']"));
		Assert.assertFalse(male.isSelected());
		male.click();
		Assert.assertTrue(male.isSelected());
		Thread.sleep(1000);
		//custom
		WebElement custom = driver.findElement(By.xpath("//input[@id='u_0_b']"));
		WebElement pronounElement = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		Assert.assertFalse(custom.isSelected());
		Assert.assertFalse(pronounElement.isDisplayed());
		custom.click();
		Assert.assertTrue(custom.isSelected());
		Assert.assertTrue(pronounElement.isDisplayed());
		
		//WebElement pronounElement = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		Assert.assertFalse(pronounElement.isSelected());
		Select pronoun = new Select (pronounElement);
		pronoun.selectByIndex(1);
		//Assert.assertTrue(pronounElement.isSelected());
		
		driver.findElement(By.xpath("//input[@id='u_0_u']")).sendKeys("Shemale");
		Assert.assertTrue(pronounElement.isSelected());
		
		Thread.sleep(10000);
		
		//click sign up
		driver.findElement(By.xpath("//button[@id='u_0_w']")).click();
		
		Thread.sleep(2000);
		//close the browser
		driver.close();
	
		
	}

}
