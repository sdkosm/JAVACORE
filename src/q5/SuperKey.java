package q5;

public class SuperKey {
		
		int a = 10;         // instance variable
		static int b = 20;  // static variable
	}

	class Low extends SuperKey {
		void dk()
		{
			// instance variable(a,b)
			
			System.out.println(super.a);
			System.out.println(super.b);
		}

		public static void main(String[] args)
		{
			
//            super.a = 800;
			
			new Low().dk();
		}
	}

