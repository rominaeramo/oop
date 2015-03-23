package lezione11;

import java.io.*;

public class TestThrowsKeyword {

    public static void main( String[] args ) {
    	
    	if (args.length != 1)
    		return;
      	
    		 try {
            readFile( args[ 0 ] );
         }
         catch( FileNotFoundException e  ) {
             System.out.println("File Not Found!");
         }
         catch ( IOException e ) {
             System.out.println("Errore nel file!");
         }
         
    }
    private static void readFile( String filename ) throws FileNotFoundException, IOException  {
       	
    			
    				BufferedReader reader = new BufferedReader( new FileReader( filename ) );
    		        
    		        String linea = null;
    		        while ( ( linea = reader.readLine() ) != null ) {
    		            System.out.println( "linea letta = " + linea );
    		        }
    		        if ( reader != null ) {
    		            try {
    		                reader.close();
    		            }
    		            catch ( IOException e ) {
    		                //Do nothing
    		            }
    		        }
 	
	        } 
       /*
        catch( FileNotFoundException e  ) {
            System.out.println("File Not Found**!");
        }
        catch ( IOException e ) {
            //Do nothing
        	System.out.println("Errore nel file**!");
        }*/
    
}


