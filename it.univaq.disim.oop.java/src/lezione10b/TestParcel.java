package lezione10b;

//le classi normali possono essere public o di package access
class Parcel4 { 
  //solo Parcel4 può accedere, implementazione nascosta	
  private class PContents implements Contents { //classe privata, 
    private int i = 11;
    public int value() { return i; }
  }
  
  //solo Parcel4, le classi di pacchetto e chi eredita 
  //da Parcel4 ha accesso a PDestination
  protected class PDestination implements Destination { 
    private String label;
    private PDestination(String whereTo) {
      label = whereTo;
    }
    public String readLabel() { return label; }
  }
  
  public Destination destination(String s) {
    return new PDestination(s);
  }
  public Contents contents() {
    return new PContents();
  }
}

public class TestParcel {
  public static void main(String[] args) {
	  
    Parcel4 p = new Parcel4();
    Contents c = p.contents();
    Destination d = p.destination("Tasmania");
    // Non posso eseguire il downcast a una classe interna private
    // Illegal -- can't access private class:
    //Parcel4.PContents pc = p.new PContents(); 
  }
} ///:~
