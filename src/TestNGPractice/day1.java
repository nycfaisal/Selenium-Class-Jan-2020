package TestNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

	@Parameters ({"URL","username"})
	@Test
	public void webloginCarLoan(String URLvalue)
	{
		//Selenium
		System.out.println("Weblogincar");
		System.out.println("URLvalue");
	}
	@Test(groups ={"smoke"})
	public void  MobileLoginCarLoan ()
	{
	//Appepium
		System.out.println("Mobilelogincar");
	 }
	@Test(dataProvider = "getData")
	public void loginAPICarLoan (String username, String password)
	{
		//Rest API automation
		System.out.println("APIlogincar");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination  - username password - good credit history
		//2nd combination - username password - no credit history
		//3rd combination - username password - fraudulent credit history
		
		Object [][] data = new Object[3][2];
		//1st set
		data[0][0] = "firstSetUserName";
		data[0][1] = "password";
		//2nd set
		data[1][0] = "secondSetUserName";
		data[1][1] = "password";
		//3rd set
		data[2][0] = "thirdSetUserName";
		data[2][1] = "password";
		
		return data;
	}
}
