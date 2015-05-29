package lezione9;

abstract class Glyph {
  //public int radius = 4; //(1)
  abstract void draw();
  Glyph() {
    System.out.println("Glyph() before draw()");
    draw();
    System.out.println("Glyph() after draw()");
  }
}

class RoundGlyph extends Glyph {
  public int radius = 1;
  RoundGlyph(int r) {
    radius = r;
    System.out.println(
      "RoundGlyph.RoundGlyph(), radius = " + radius);
  }
  void draw() {
    System.out.println(
    		"RoundGlyph.draw(), radius = " + radius);
    		//"RoundGlyph.draw(), radius = " + super.radius); //(1)
  }
}

public class PolyConstructors {
 
  public static void main(String[] args) {
    new RoundGlyph(5);
    
  }
}  