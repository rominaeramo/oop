//: c07:music:Music2.java
// Overloading instead of upcasting.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package lezione9.music;
 

class Stringed extends Instrument {
  public void play(Note n) {
    System.out.println("Stringed.play() " + n);
  }
}

class Brass extends Instrument {
  public void play(Note n) {
    System.out.println("Brass.play() " + n);
  }
}


class B extends Instrument {
	
}

class C extends Instrument {
	
}

public class Music2 {
 
/*	
  public static void tune(Wind i) {
    i.play(Note.MIDDLE_C);
  }
  public static void tune(Stringed i) {
    i.play(Note.MIDDLE_C);
  }
  public static void tune(Brass i) {
    i.play(Note.MIDDLE_C);
  }
	 */

  
  public static void tune(B i) {
	    //i.play(Note.MIDDLE_C);
	    System.out.println("Sono tune su B");    
  }

  public static void tune(Instrument i) {
		   // i.play(Note.MIDDLE_C);
		    System.out.println("Sono tune su Instrument");
  }
	  
  public static void main(String[] args) {
    Wind flute = new Wind();
    Stringed violin = new Stringed();
    Brass frenchHorn = new Brass();
    B b = new B();
   // C c = new C();
    tune(flute); // No upcasting
    tune(violin);
    tune(frenchHorn);
    tune(b);
   // tune(c);
    }
} ///:~
