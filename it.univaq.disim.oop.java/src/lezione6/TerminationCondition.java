package lezione6;

class Book {
	  boolean checkedOut = false;
	 
	  Book(boolean checkOut) {
		System.out.println("Book Constructor");
	    checkedOut = checkOut;
	  }
	  void checkIn() {
	    checkedOut = false;
	  }
	  public void finalize() {
	    if(checkedOut)
	      System.out.println("Book Error: checked out");
	  }
	}

class Book2 {
	  boolean checkedOut = false;
	 
	  Book2(boolean checkOut) {
		System.out.println("Book2 Constructor");
	    checkedOut = checkOut;
	  }
	  void checkIn() {
	    checkedOut = false;
	  }
	  public void finalize() {
	    if(checkedOut)
	      System.out.println("Book2 Error: checked out");
	  }
	}


public class TerminationCondition {
  
  public static void main(String[] args) {
    Book novel = new Book(true);
    // Proper cleanup:
    //novel.checkIn();
    // Drop the reference, forget to clean up:
    
   // new Book(true);
   // new Book2(true);
    novel = null;
    // Force garbage collection & finalization:
    System.gc();				// In questo modo mi accorgo se c'e' qualche 
    							// libro non acquisito
  }

} 
