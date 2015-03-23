package lezione11;

import java.io.*;

public class TestCheckedException {
	

	public static void f() {
		System.out.println("Sono f()");
	}
	
    public static void main(String[] args) {
    	
    	if (args.length!=1)
             return;
    	
    	try {
    		int i = 1/0;
    	}
    	catch (ArithmeticException e){
    		System.out.println("ArithmeticException");
    	}
    	
        FileReader reader = null;
        try {
               
			   reader = new FileReader( args[ 0 ] );
		
               //reader.close();
               System.out.println("Sono dopo reader");
        }
        
        
        catch(FileNotFoundException e) {
             System.out.println("File non trovato");
        }
        catch(IOException e) {
             System.out.println("File non trovato");
        }
       finally {
        	System.out.println("Blocco sempre eseguito");  
        	if (reader!=null) {
                 try {
                      reader.close();
                 }
                 catch (IOException e) { 
                	 //Do nothing 
                 }
            }
        }  
        
        System.out.println("Sono dopo finally");
        f();
   }
}
