package lezione16;

public class TestSingleton {

   public static void main( String[] args ) {
     Singleton s = Singleton.getInstance();

     s.singletonOperation();
     System.out.println( "Prima reference: " + s );
     System.out.println( "Valore del singleton data: " +  s.getSingletonData() );

     Singleton s1 = Singleton.getInstance();
     s1.singletonOperation();
     System.out.println( "\nSeconda reference: " + s1 );
     System.out.println( "Valore del singleton data di s1: " +  s1.getSingletonData() );
     System.out.println( "Valore del singleton data di s: " +  s.getSingletonData() );
    }
}
