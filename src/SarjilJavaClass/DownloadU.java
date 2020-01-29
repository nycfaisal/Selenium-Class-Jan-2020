package SarjilJavaClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","//Users//faisalmohammad//Documents//chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		//textfile textbox
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("JavaSelect");
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		//pdf textbox
		driver.findElement(By.xpath("//textarea[@id='pdfbox']")).sendKeys("Createpdf");
		driver.findElement(By.xpath("//button[@id='createPdf']")).click();
		//download
		driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click();
		
		

	}

}
