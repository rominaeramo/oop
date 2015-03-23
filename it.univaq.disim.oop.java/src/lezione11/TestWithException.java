package lezione11;



public class TestWithException {
 
   public static void main(String[] args) {
	
     try {
        for (int i= 0; i < 2; i++) {
           System.out.println("Argomento i-esimo(" + i + "): " + args[i]);
        }
      }
      catch(ArrayIndexOutOfBoundsException e ) {
        System.out.println("Si e' verificata l'eccezione");
      }
      finally {
    	  	System.out.println("Corpo sempre eseguito");
      }
     
      System.out.println("Sono dopo il finally");
      
   }

}
