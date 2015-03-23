package lezione7;

class Poppet {
  private int i;
  Poppet(int ii) { i = ii; }
}

public class BlankFinal {
  private static final int i = 0; // Initialized final
  private final int j; // Blank final
  private final Poppet p; // Blank final reference
  
  /*public static final int x;		//Provare a decommentare
  static{
	  if (i>5){
		  x=5;  
	  } 
  }*/
  
  
  // Blank finals MUST be initialized in the constructor:
  public BlankFinal() {
    j = 1; // Initialize blank final
    p = new Poppet(1); // Initialize blank final reference
  }
  
  public BlankFinal(int x) {
	//this();
    j = x; // Initialize blank final
    p = new Poppet(x); // Initialize blank final reference
  }
  
  public static void main(String[] args) {
    new BlankFinal();
    new BlankFinal(47);
  }
} ///:~
