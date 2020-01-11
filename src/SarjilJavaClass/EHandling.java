package SarjilJavaClass;

public class EHandling {
//allows to capture the detail error that is happening within the method that is worked on. it helps during debugging.
	public static void mian (String[] args){
	/*try{	
		int a =5, b=0, c;
		
		c = a/b;
		
		System.out.println(c);
	}
	catch (Exception x){
		System.out.println("Divide by zero output is " + x);
	}*/
		try{
		int a[] = new int[5];
		 a[1]=20;
		 a[2]=30;
		 a[3]=40;
		 a[10]=25;
		}
		catch(Exception y){
			System.out.println(y);
		}
		
	}
	
}
