package q9;

//access modifier wirh overriding rule private and protected: private can not be override

class Parent {
    // private methods are not overridden
    private void m1()
    {
        System.out.println("From parent m1()");          //not override main class as well as subclass
    }
  
    protected void m2()
    {
        System.out.println("From parent m2()");          //From parent m2()
    }
    
//    final void show() {
//    	                                                 //final not override
//    }
//    static void m1()
//    {
//                                                       //static not override
//    }
}
  
//we can call parent class by super keyword

class Child extends Parent {
    // new m1() method
    // unique to Child class
    private void m1()
    {
        System.out.println("From child m1()");            //not override
    }
  
    // overriding method

    @Override
    public void m2()
    {
        System.out.println("From child m2()");            //From child m2()
    } 
}
  
// Driver class
class Main {
    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        obj1.m2();
        Parent obj2 = new Child();
        obj2.m2();
    }
}
