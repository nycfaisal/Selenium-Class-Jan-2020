package SarjilJavaClass;

public class Overloading {
	
	//is a process of specify multiple methods under a class. Allows different methods to have same name but different signature
	//ex: number of parameters, type of parameters, 
	// method name, order of parameters.
	//parameter: is a argument value that passed into a function
	
	public static int Add (int a, int b){
		return (a+b);
	}
	public static double Add(double a, double b){
		return (a+b);
	}
	public static String Add(String a, String b){
		return (a+b);
	}
	
	public static void main (String [] args){
		
		System.out.println(Add(1,50));
		System.out.println(Add(5.343, 40.4535));
		System.out.println(Add("Java", "Selenium"));
	}
	
	

}
