import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class spicejets {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//dropdown looping UI
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		
		//intantializing chromedriver
		WebDriver driver = new ChromeDriver();
		
		//get URL
		driver.get("https://www.spicejet.com/");
		
		//type of trips
		//size of Radiobutton
		List<WebElement> triptype = driver.findElements(By.xpath("/table[@id='ctl00_mainContent_rbtnl_Trip'] //input[@type='radio']"));
		Assert.assertEquals(triptype, 3);
		
		//variable for one way,round trip and multicity
		WebElement oneway = driver.findElement(By.xpath("//id[@id='ctl00_mainContent_rbtnl_Trip_0']"));
		WebElement roundtrip = driver.findElement(By.xpath("//id[@id='ctl00_mainContent_rbtnl_Trip_1']"));
		WebElement multicity = driver.findElement(By.xpath("//id[@id='ctl00_mainContent_rbtnl_Trip_2'"));
		
		//verifying default 
		Assert.assertTrue(oneway.isSelected());
		Assert.assertFalse(roundtrip.isSelected());
		Assert.assertFalse(multicity.isSelected());
		
		//funtionality of Radiobutton
		roundtrip.click();
		Thread.sleep(1000);
		multicity.click();
		Thread.sleep(1000);
		oneway.click();
		Thread.sleep(1000);
		
		//variable for calender
		WebElement departure = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		//Calendar enable/disable
		//create a if statement which would validate /disability
		
		
		//dropdown
		//passenger Queries
		WebElement passenger = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		//Verifying initial text
		Assert.assertEquals(passenger.getText(), "1 Adult");
		
		//choosing number of passengers
		passenger.click();
		
		//choosing adult passenger
		WebElement adult = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
		Select adults = new Select(adult);
		adults.selectByIndex(4);
		
		//choosing child
		WebElement child = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
		Select children = new Select(child);
		children.selectByValue("1");
		
		//choosing infant
		WebElement infant = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']"));
		Select infants = new Select(infant);
		infants.selectByIndex(0);
		
		//Verifying result
		Assert.assertEquals(passenger.getText(), "5 Adult, 1 Child");
		
		//finish choosing passenger
		passenger.click();
		
		Thread.sleep(1000);
		
		//choosing destination
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='AMD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='IXB'])[2]")).click();
		
		//checkbox sizes
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Assert.assertEquals(checkbox.size(), 6);
		
		//checkboxes
		WebElement fandf = driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]"));
		//verifying checkbox is empty
		Assert.assertFalse(fandf.isSelected());
		//checkbox is selected
		fandf.click();
		//verifying checkbox is selected
		Assert.assertTrue(fandf.isSelected());
		
		Thread.sleep(2000);
		
		
		//closing the browser
		driver.close();
		

	}

}
