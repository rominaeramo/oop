package lezione8;



public class PrivateOverride {
 
  //public void f()   {					// In tal caso si puo dire che f() di Derived 
										// "override" f() di PrivateOverride
  //  System.out.println("private f()");
  //}		
  
private final void f() {
    System.out.println("private f()");
  }
  public static void main(String[] args) {
	    PrivateOverride po = new Derived();
	    po.f();	     
  }

}

class Derived extends PrivateOverride {
  public void f() {
    System.out.println("public f()");
  }
  

} ///:~
