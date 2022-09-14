package q10;

import java.util.ArrayList;

public class IndexOutOfBound {

	 public static void main(String[] args)
	    {
	        ArrayList<String> lis = new ArrayList<>();
	        lis.add("My");                      //index 0
	        lis.add("Name");                    // index 1
	        System.out.println(lis.get(2));    // but not available index 2 so what ? tha't why unable to fetch it !!
	    }
}
