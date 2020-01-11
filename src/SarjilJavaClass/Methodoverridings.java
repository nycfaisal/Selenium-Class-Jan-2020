package SarjilJavaClass;
//driver class
public class Methodoverridings {

	public static void main(String[] args) {
		// is a feature that allows a subclass or childclass
		//to provide a specific implementation of a method
		// that is already used in super/parent classes

		//method overriding is reference to parent object, then
		// parent show() method is called
		ChildClassMain obj1 = new ChildClassMain(); //--- parent class object
		Child obj2 = new Child(); //--- child class object
		obj1.show();
		//if the methodoverriding referencing to child object show()
		//is called. this is during run time of Polymorphism
		obj2.show();
	}
}
//inheritted class
class Child extends ChildClassMain {
	@Override
	void show(){
		System.out.println("Animal child show");
	}
}
	//parent class
class ChildClassMain {
	
	void show()
	{
		System.out.println("Animal show");
	}
}

	


