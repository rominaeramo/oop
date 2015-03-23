package lezione10;

 
public class TestRandVals {
 
  public static void main(String[] args) {
    System.out.println(RandVals.randomInt);
    System.out.println(RandVals.randomLong);
    System.out.println(RandVals.randomFloat);
    System.out.println(RandVals.randomDouble);
    System.out.println(RandVals.randomInt);
    
    System.out.println(RandVals.rand);
    System.out.println(RandVals.rand);
    
    System.out.println("Uso ancora rand e genero " + RandVals.rand.nextInt(10));
    System.out.println(RandVals.c);
    RandVals.c.x++;
    RandVals.c.y++;
    System.out.println(RandVals.c);
    
    //RandVals.c = new C30();
  }
}  
