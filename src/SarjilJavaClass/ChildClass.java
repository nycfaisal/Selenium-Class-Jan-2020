package SarjilJavaClass;

public class ChildClass extends BaseClass {
	
	public void CalcHomeEMI()
	{
		System.out.println("you EMI is 50K");
	}
	public void calcCarEMI()
	{
	System.out.println("Your EMI is 25K");
	}
	
	public static void main (String[]args)
	{
		ChildClass obj1 = new ChildClass();
		obj1.calcCarEMI();
		obj1.CalcHomeEMI();
		obj1.offerService();
		
		BaseClass obj2 = new BaseClass();
		obj2.calculateHOA();
	}
}
