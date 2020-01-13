package SarjilJavaClass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngClassPractice {
	
	@BeforeTest
	public void browserLaunch ()
	{
		System.out.println("Open browser");
	}
	
	@Test(enabled = false)
	public void signUp ()
	{
		System.out.println("sign up");
	}
	@Test (description ="this is signup method", priority = 1, testName= "sanity")
	public void signIn ()
	{
		System.out.println("sign in");
	}
	@Test
	public void changeDOB()
	{
		System.out.println("DOB");
	}
	@Test
	public void changeSchool()
	{
		System.out.println("change the school");
	}
	@Test 
	public void sendEmail()
	{
		System.out.println("Send email to support team");
	}
	@Test
	public void signOut()
	{
		System.out.println("sign out");
	}
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("Closing the Browser");
	}

}
