package lezione11;

public class Test2WithException {

   public static void main(String[] args) {

      try {
         anotherMethod(args);
      }
      catch(ArrayIndexOutOfBoundsException e ) {
         System.out.println("Si e' verificata l'eccezione");
      }
   }
   
   public static void anotherMethod(String[] args) {
       for (int i= 0; i < 10; i++) {
           System.out.println("Argomento i-esimo(" + i + "): " + args[ i ]);
       }
   }

}
