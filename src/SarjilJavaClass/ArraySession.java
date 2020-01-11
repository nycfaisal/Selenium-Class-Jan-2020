package SarjilJavaClass;

public class ArraySession {

	public static void main(String[] args) {


	
	//Array: Container that data/value single type
	//Store multiple values in a single variable
	//limitation: sizing & type issue under conventional array
	//dynamic array can overcome these limitation
		
		//1. Declare the array (int[] array)
		//2. initialize the array and set its size (array = new array[3])
	
	
		
		String [] names = new String [4];
		names[0] = "Selenium";
		names[1] = "Java";
		names[2] = "Auto";
		names[3] = "12.34";
		
		//System.out.println(names[0] +"\n" + names[2]);
		
		int [] numbers = new int [4];
		numbers[0] = 123;
		numbers[1] = 5457;
		numbers[2] = 56789;
		numbers[3] = 7886;
		
		//System.out.println(numbers[0] +"\n" + numbers[2]);
		
		for (int i=0; i<names.length; i++)
		{
			System.out.println(names[i]);
		}
	
		String [] namesone = new String [4];
		namesone[0] = "Selenium";
		namesone[1] = "Java";
		namesone[2] =  "true";
		namesone[3] = "12.34";
		
		for( String test: namesone)
		{
			System.out.println(test);
		}
	

}

	

}
