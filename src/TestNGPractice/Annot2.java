package TestNGPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot2 {
	
	WebDriver driver = null;

	@BeforeSuite
	public void Login() throws IOException 
	{	//object of properties which can interpret/read the data from file
		Properties prop = new Properties();
		// object of this class know location of the file
		FileInputStream fis = new FileInputStream("/Users/faisalmohammad/Documents/workspace/Selenium practice/src/TestNGPractice/datadriven.properties");
		//reading the specified file
		prop.load(fis);
		//printing the key; in this case username is key
		//System.out.println(prop.getProperty("username"));
		System.setProperty("webdriver.chrome.driver","//Users//faisalmohammad//Documents//chromedriver 2");
		if (prop.getProperty("browser").contains("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (prop.getProperty("browser").contains("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		else 
		{
			 driver = new InternetExplorerDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
		
	}
}