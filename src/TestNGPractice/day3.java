package TestNGPractice;

import org.testng.annotations.Test;

public class day3 extends day2{

	
	@Test(enabled =false)
	public void webloginPersonalLoan()
	{
		//Selenium
		System.out.println("Webloginpersonal");
	}
	@Test (groups ={"smoke"})
	public void  MobileLoginPersonalLoan ()
	{
	//Appepium
		System.out.println("Mobileloginpersonal");
	 }
	@Test(dependsOnMethods={"webloginHomeLoan"})
	public void loginAPIPersonalLoan ()
	{
		//Rest API automation
		System.out.println("APIloginpersonal");
	}
	@Test (timeOut = 4000)
	public void timeout ()
	{
		System.out.println("this is TestNG timeout block");
	}
}