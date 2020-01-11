package SarjilJavaClass;
interface Persons{
	public void Subject();
	public void studentName();
}

public class JavaInterface implements Persons{

	public static void main(String[] args) {
		
		//reference type in java which is similar to class
		//it will contains abstract methods. A class will be 
		//implemented an interface
		
		//skeletons: Interface person
		//public void subject ();
		//public void studentName ();
		
		JavaInterface e = new JavaInterface();
		e.Subject();
		e.studentName();
		
	}

	public void Subject(){
		System.out.println("this is Math Student");
	}
	public void studentName(){
		System.out.println("John");
	}
}

