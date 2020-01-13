package SarjilJavaClass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng1 {

	@BeforeTest
	public void OpenBrowser()
	{
		System.out.println("Browser Open");
	}
	//steps annotation
	@Test(priority = 0, description = "this is mandatory steps", testName = "smoke",enabled = false)
	public void FirstRegistration()
	{
		System.out.println("User should first register an account");
	}
	
	@Test(priority = 1, enabled = false)
	public void Login()
	{
		System.out.println("Log in Success");
	}
	@Test(priority = 3)
	public void prepareEmail()
	{
		System.out.println("create mail");
	}
	@Test
	public void signoff ()
	{
		System.out.println("Log out from app");
	}
	//post condition Annotaitons
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("Browser Closed");
	}
	
}
