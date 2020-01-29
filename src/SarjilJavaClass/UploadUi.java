package SarjilJavaClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadUi {
	public static void main (String[] args){
	System.setProperty("webdriver.chrome.driver","//Users//faisalmohammad//Documents//chromedriver 2");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/FileUpload.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@id='input-4']")).sendKeys("/Users/faisalmohammad/Documents/screenshots/amazon.png");
	}
}
