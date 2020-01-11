package SarjilJavaClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	public static void main (String[] args){
		
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ProSmart");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ProSmart");
		driver.findElement(By.xpath("//input[cotains(@id,'u_0_')]")).click();
		
		
		
	}

}
