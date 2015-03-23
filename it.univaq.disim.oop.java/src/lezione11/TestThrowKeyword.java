package lezione11;


import java.io.*;

public class TestThrowKeyword {
    public static void main( String[] args ) {
    	
    	if (args.length != 1)
    		return;
    	
        try {
            readFile( args[ 0 ] );
        }
        catch( FileNotFoundException e  ) {
            System.out.println("File Not Found nel main!");
        }
        catch ( IOException e ) {
            System.out.println("Errore nel file nel main!");
        }
    }
    private static void readFile( String filename ) throws FileNotFoundException, IOException {
        BufferedReader reader = null;
        try {
           reader = new BufferedReader(new FileReader( filename ) );
           String linea = null;
           while ( ( linea = reader.readLine() ) != null ) {
             System.out.println( "linea letta = " + linea );
           }
        }
        catch( FileNotFoundException e  ) {
            System.out.println("File Not Found!");
            //Prova a commentare la riga seguente
            throw e;
        }
	    catch ( IOException e ) {
	            System.out.println("Errore nel file!");
	            throw e;
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
}
