package q5;

public class ThisKey {

	 int a = 10;	 
	 static int b = 20;
	 
	    void dk()
	    {
	        // instance variable(a,b)
	    	
	        this.a = 100;	 
	        this.b = 600;
	 
	        System.out.println(a);
	        System.out.println(b);
	    }
	 
	    public static void main(String[] args)
	    {
//	    	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	    		Cannot use this in a static context
//	         this.b = 800;
	    	
	        new ThisKey().dk();	
	    }
	}
	
