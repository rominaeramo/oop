package lezione11;

 
class SimpleException extends Exception {}

public class SimpleExceptionDemo {
  
  public void f() throws SimpleException {
    System.out.println("Throw SimpleException from f()");
    throw new SimpleException();
  }
  public static void main(String[] args) {
    SimpleExceptionDemo sed = new SimpleExceptionDemo();
    try {
      sed.f();
    } catch(SimpleException e) {
      System.err.println("Caught it!");
    }
    
  }
} ///:~
