package lezione11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class MyException3 extends RuntimeException {

    public MyException3() {
    }

    public MyException3( String message ) {
        super( message );
    }

    public MyException3( String message, Throwable cause ) {
        super( message, cause );
    }

    public MyException3( Throwable cause ) {
        super( cause );
    }
}


public class TestMyException3 {
	
	private static void readFile( String filename ) {

        BufferedReader reader = null;
        try {
          reader = new BufferedReader( new FileReader( filename ) );
          String linea = null;
          while ( ( linea = reader.readLine() ) != null ) {
              System.out.println( "linea letta = " + linea );

          }
        }
        catch ( FileNotFoundException e ) {
          System.out.println( "File Not Found!" );
          throw new MyException3( "MyException3", e ); 
          //throw new MyException3( "MyException3"); //(1)
        }
        catch ( IOException e ) {
            System.out.println( "Errore nel file!" );
            throw new MyException3( "MyException3", e );
        }
        finally {
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

	
	public static void main( String[] args ) {
        if (args.length != 1){
        	System.out.println("Use: TestMyException <filename>");
        	return;
        }
        
        try{
        	readFile(args[0]);
        }
        
        catch ( MyException3 e ) {
            System.out.println( "MyException3! " + e.getCause() ); 
        	    //System.out.println( "MyException3! " );	//(1)
        }
        
    }
}