package lezione6.samplePackage2;

import lezione6.samplePackage1.*;

public class ChocolateChip extends Cookie {

	  public ChocolateChip() {
	   System.out.println("ChocolateChip constructor");
	  }
	  public static void main(String[] args) {
	    ChocolateChip x = new ChocolateChip();
	    x.bite(); // Can't access bite unless bite is protected
	  }
	} ///:~

 class ChocolateChip2 {

	  public ChocolateChip2() {
	   System.out.println("ChocolateChip2 constructor");
	  }
	  public static void main(String[] args) {
	    ChocolateChip2 x = new ChocolateChip2();
	     //! x.bite(); // Can't access bite unless bite is public
	  }
	} ///:~