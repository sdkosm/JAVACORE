package q13;

public final class Employee {

	final String pancardNumber;    
	public Employee(String pancardNumber)  
	{    
	this.pancardNumber=pancardNumber;    
	}  
	public String getPancardNumber(){    
	return pancardNumber;    
	}    
	public class ImmutableDemo  
	{  
	public static void main(String ar[])  
	{  
	Employee e = new Employee("DK");  
	String s1 = e.getPancardNumber();  
	System.out.println("Pancard Number: " + s1);    //out should be like Pancard Number: DK
	}	
}
}