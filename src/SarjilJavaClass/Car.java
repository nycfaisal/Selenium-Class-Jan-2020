package SarjilJavaClass;

public class Car {
	
	//Q6. Create a class Car is a base class, class SportCar is a derived class which extends Car class and class Test is a driver class to run program?
	//(Inheritance & Constructor): NOTE: We will cover this next week but try to do some research and solve the problem.
	
	//base class = parent class = super class
	//child class = subclass
	//Car class has 2 fields/characters
	
	public int gear;
	public int speed;
	
	public Car (int gear, int speed){
		this.gear = gear;
		this.speed = speed;
	}
	//3 methods
	public void pushBrake (int decrement)
	{
		speed -=decrement;
	}
	public void increaseSpeed(int increment)
	{
		speed +=increment;
	}
	//toString is a function that allows to return object exist within a method
	public String toString()
	{
		return ("no of gears are " + gear + "\n" + "speed of the Car is " + speed);
	}
	
	public static void main (String[] args)
	{
		
	}
	
}
