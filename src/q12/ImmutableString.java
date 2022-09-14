package q12;

public class ImmutableString {
	 public static void main(String args[]){  
		   String s="Java";  
//		   s.concat(" Program");//concat() method appends the string at the end 
		   s=s.concat(" Program");  
		   System.out.println(s);     //will print Sachin because strings are immutable objects 
		 } 
}
