package lezione11;

import java.io.*;

public class TestMultiCheckedException {
    public static void main( String[] args ) {

    	if (args.length != 1)
        	return;

        BufferedReader reader = null;
        try {
          reader = new BufferedReader( new FileReader( args[ 0 ] )); 
          String linea = null;
          while ( ( linea = reader.readLine() ) != null ) {
                System.out.println( "linea letta = " + linea );
          }
        }
        catch ( FileNotFoundException e ) {
            System.out.println( "File non trovato!" );
        }
        catch ( IOException e ) {
            System.out.println( "Eccezione in lettura!" );
        }
        finally {
        	System.out.println("Blocco eseguito");
              if ( reader != null ) {
                  try {
                      reader.close();
                  }
                  catch ( IOException e ) {
                      //Do nothing
                  }
              }
        }
   }
}
