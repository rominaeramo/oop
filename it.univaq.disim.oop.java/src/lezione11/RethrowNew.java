package lezione11;

class AinCatch {

	public void sampleMethod() {
		System.out.println("sampleMethod()");
	}
}

class OneException extends Exception {
  public OneException(String s) { super(s); }

  public void myMethod(){
	  System.out.println("myMethod");
  }
}

class TwoException extends Exception {
  public TwoException(String s) { super(s); }
  
  

}

public class RethrowNew {
 
  public static void f() throws OneException {
    System.out.println("originating the exception in f()");
    throw new OneException("thrown from f()");
  }
  
  public static void main(String[] args) throws TwoException  {
    try {
      f();
    } catch(OneException e) {
      System.err.println("Caught in main, e.printStackTrace()");
      AinCatch a = new AinCatch();
      a.sampleMethod();
      e.myMethod();
      e.printStackTrace();
      throw new TwoException("from main()");	//Qui viene rilanciata un'eccezione diversa da quella intercettata
      //throw e;
	
    }
 
  }
} ///:~
