package q8;

public class Encapsulation {

	private String name;   
	private String id;   
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public class RunEncap{   
		public static void main(String args[])
		{     
			
	    Encapsulation encap = new Encapsulation();    
		encap.setName("Deepak lodha");     
		encap.setAge(22);     
		encap.setId("8518068366");
		
//		System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
		
		}
	}
	
}
