package SarjilJavaClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//faisalmohammad//Documents//chromedriver 2");
		WebDriver driver = new ChromeDriver();
		//handling the login (username:password@URL)
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//verifying the congratz Text
		String PMS = driver.findElement(By.xpath("//*id='content']/div/p")).getText();
		System.out.println(PMS);
	}

}
