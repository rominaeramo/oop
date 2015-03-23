package lezione11;


class BaseballException extends Exception {}
class FoulException extends BaseballException {}
class StrikeException extends BaseballException {}

abstract class Inning {
  public Inning() throws BaseballException {
	  System.out.println("Sono nel costruttore di Inning");  
  }

  public void event() throws BaseballException {
    // In realtà non viene sollevata nessuna eccezione pero' in questo modo 
	// si costringe il programmatore ad intercettare tutte le eccezioni 
	// che possono essere aggiunte nelle versioni di event() sovrapposte 
	// nelle sottoclasse
  }
  
  public abstract void atBat() throws StrikeException, FoulException;

  public void walk() {} // Throws no checked exceptions

}

class StormException extends Exception {}
class RainedOutException extends StormException {}
class PopFoulException extends FoulException { }


interface Storm {
  public void event() throws RainedOutException;
  public void rainHard() throws RainedOutException;
}

public class StormyInning extends Inning implements Storm {
  // OK to add new exceptions for constructors, but you
  // must deal with the base constructor exceptions:
  public StormyInning()
    throws RainedOutException, BaseballException {}			//Per esempio se viene cancellato BaseballException c'e'
  															//un errore di compilazione

  public StormyInning(String s) 
    throws FoulException, BaseballException {}

  // Regular methods must conform to base class:
  // void walk() throws PopFoul {} //Compile error

 
  // If the method doesn't already exist in the
  // base class, the exception is OK:
  public void rainHard() throws RainedOutException {}
  
  
  
  // You can choose to not throw any exceptions,
  // even if the base version does:
  public void event() {//throws RainedOutException,BaseballException  {
	    //throw new RainedOutException();
  }

  // Overridden methods can throw inherited exceptions:
  public void atBat() throws PopFoulException {
	  throw new PopFoulException();
  }
  
  
  public static void main(String[] args) {
    try {
      StormyInning si = new StormyInning();
      si.atBat();
    } catch(PopFoulException e) {
      System.err.println("Pop foul");
    } catch(RainedOutException e) {
      System.err.println("Rained out");
    } catch(BaseballException e) {
      System.err.println("Generic baseball exception");
    }
 // Strike not thrown in derived version.
    try {
    	
      // What happens if you upcast?
      Inning i = new StormyInning();
      i.atBat();
 
      // You must catch the exceptions from the
      // base-class version of the method:
    } catch(StrikeException e) {
      System.err.println("Strike");
    } catch(FoulException e) {
      System.err.println("Foul");
    } catch(RainedOutException e) {
      System.err.println("Rained out");
    } catch(BaseballException e) {
      System.err.println("Generic baseball exception");
    }
    
    try {
    	Inning si = new StormyInning();
    	si.event();
    	
    } catch (BaseballException e){
    	System.err.println("StormyInning");
    } catch (RainedOutException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    try {
    	Storm si = new StormyInning();
    	si.event();
    	
    } catch (BaseballException e){
    	System.err.println("StormyInning");
    } catch (RainedOutException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
} 