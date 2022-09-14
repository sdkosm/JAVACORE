
//In method overloading, more than one method shares the same method name with a different signature in the class

package q3;

public class Overloading {

		static int add(int a, int b)    //two parameter
	    {
	      return a + b;
	    }
	 
	    static int add(int a, int b, int c)  // three parameter but both methods are same
	    {
	        return a + b + c;
	    }
	 
	    public static void main(String args[])
	    {
	          System.out.println("add() with 2 parameters");
	          System.out.println(add(4, 6));
	       
	          System.out.println("add() with 3 parameters");
	          System.out.println(add(4, 6, 7));
	    }

	}

