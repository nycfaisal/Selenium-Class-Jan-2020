package SarjilJavaClass;
//derived class
public class BMW extends Car{
	//BMW is a subclass
	public int seatNum;
	//BMW subclass has constructor
	public BMW (int gear, int speed, int startspeed){
		//invoking base class(Car) constructor
		super(gear, speed);
		seatNum = startspeed;
	}
	//encapsulation getter and setter
	public void setNum (int newValue)
	{
		seatNum = newValue;
	}
	public String toString()
	{
		return (super.toString() + "\nNumber of Seat is " + seatNum);
	}

}
