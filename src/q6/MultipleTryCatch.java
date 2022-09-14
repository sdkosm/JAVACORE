package q6;

public class MultipleTryCatch {
	
	 public static void main(String[] args) { 
	
	try{    
        int a[]=new int[5];    
        
        System.out.println(a[10]);  
       }    
       catch(ArithmeticException e)  
          {  
           System.out.println("Arithmetic Exception occurs");  
          }    
       catch(ArrayIndexOutOfBoundsException e)  
          {  
           System.out.println("ArrayIndexOutOfBounds Exception occurs");    //result why ? bcz index is not in range
          }    
       catch(Exception e)  
          {  
           System.out.println("Parent Exception occurs");  
          }                 
}  
	
}
