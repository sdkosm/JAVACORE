package q81;

//inheritance example 

public class Bird {
	  
	// define the bird
    String color;
    int legs;
  
    // bird performs
    public void eat()
    {
        System.out.println("This bird has eaten");
    }
  
    public void fly()
    {
        System.out.println("This bird is flying");
    }
}


//extends the bird class
class Sparrow extends Bird {

	// Overriding the fly method

	public void fly()
	{
		System.out.println("Sparrow flys!!!!");
	}
}
