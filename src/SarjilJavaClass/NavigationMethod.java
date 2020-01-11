package SarjilJavaClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver,chrome,driver", "//Users//faisalmohammad//Documents//chromedriver 2");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.get("http://www.ebay.com/");
	
	System.out.println(driver.getTitle());
	
	driver.navigate().back();
	System.out.println(driver.getTitle());
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	driver.navigate().refresh();
	System.out.println(driver.getTitle());
	
	driver.close();

	}

}
