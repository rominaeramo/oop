package lezione6.samplePackage1;

public class Cookie {
	  A a;
	
	  public Cookie() {
	   System.out.println("Cookie constructor");
	   a = new A();
	  }
	 // void bite() { System.out.println("bite"); }
	  // public void bite() { System.out.println("bite"); }
	 protected void bite() { System.out.println("bite"); }
	 protected static void bite2() {}	

} 

///:~