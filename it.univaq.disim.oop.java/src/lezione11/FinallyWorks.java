//: lezione11/FinallyWorks.java
// L'istruzione finally viene sempre eseguita

package lezione11;

class ThreeException extends Exception {}

public class FinallyWorks {
   
  static int count = 0;
  public static void main(String[] args) {
    while(true) {
      try {
    	  
        // Post-increment is zero first time:
        if(count++ == 0) {
        	System.out.println("Valore di count " + count);
        	throw new ThreeException();
        }
        System.out.println("No exception");
        
      } catch(ThreeException e) {
        System.out.println("ThreeException");
        //break; // Togliere il break nel finally
      } finally {
        System.out.println("In finally clause, valore di count " + count);
        if(count == 2) break; // out of "while"
      }
    }
    System.out.println("Sono dopo il while");
    
  }
}
