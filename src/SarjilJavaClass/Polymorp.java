package SarjilJavaClass;

public class Polymorp {

	//has the ability of an object to take many form
	//it actually occurs when a parent class refers
	//to a child/sub class
	//child/sub class of a class can define their own unique
	//behavior and share functionality of the parent class
	//there 2 type of polymorphism: static and dynamic
	//inheritance, Method overloading comes into polymerphism concept
	
	public static void main(String[]args){
		
		PolyBank bank_2 = new PolyBank2();
		PolyBank bank_3 = new PolyBank3();
		
		System.out.println(bank_2.Interestrate());
		System.out.println(bank_3.Interestrate());
	}
}
