package TestNGPractice;


import org.testng.annotations.Test;

public class day2 {

	
	@Test
	public void webloginHomeLoan()
	{
		//Selenium
		System.out.println("Webloginhome");
	}
	@Test(groups ={"smoke"})
	public void  MobileLoginCarLoan ()
	{
	//Appepium
		System.out.println("Mobileloginhome");
	 }
	@Test
	public void loginAPICarLoan ()
	{
		//Rest API automation
		System.out.println("APIloginhome");
	}
}
