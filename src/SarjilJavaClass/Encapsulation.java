package SarjilJavaClass;
//parent class, Super class
public class Encapsulation {
	
	public static void main (String [] args){
		
		Encap obj = new Encap();
		obj.setEmpName("");
		obj.setEmpAge(25);
		obj.setEmpSSN(1234567);
		
		System.out.println("Employee Name" + obj.getEmpName());
		System.out.println("Employee Age" + obj.getEmpAge());
		System.out.println("Emplyee SSN" + obj.getEmpSSN());
	}
}
//child class, Sub-Class (constructor)
	class Encap {
		// is the process of combining data and function into 
		// a single unit class. the data is not accessed
		//directly. it is accessed through the function/method
		//present inside the class.

		private int ssn;
		private String empName;
		private int empAge;
		
		public int getEmpSSN(){
			return ssn;
		}
		public String getEmpName(){
			return empName;
		}
		public int getEmpAge (){
			return empAge;
	}
		public void setEmpName (String newValue){
			empName = newValue;
		}
		public void setEmpAge (int newValue){
			empAge = newValue;
		}
		public void setEmpSSN (int newValue){
			ssn = newValue;
		}

		
}
