package SarjilJavaClass;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class DynamicArr {
	
	public static void main(String[] args){
	//ArrayList is built in Java function	
		ArrayList myArr = new ArrayList ();
		
		//add is a built in method
		//each array value is treated as object
		myArr.add(12);
		myArr.add("Selenium"); // ----> "selenium" is treated as an object
		myArr.add(true);
		myArr.add(12.45);
		
		//System.out.println(myArr);
		
		//System.out.println(myArr.get(2));
		
		myArr.remove(1);
		System.out.println(myArr);
		
		
	}

}
