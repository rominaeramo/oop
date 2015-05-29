package lezione11;

import java.io.FileNotFoundException;
import java.io.IOException;

public class WithFinally2 {

	public static void f() throws IOException {
	  try {
		  throw new IOException();
	  } 
	  catch (FileNotFoundException e) {
		  System.out.println("catch in f()");
	  } finally {
		  System.out.println("finally in f()"); //viene prima eseguito questo finally, 
		  										//mentre l'handler eseguito sarà quello nel metogo g()
	  }		
	} 
	
	public static void g() {
		try {
			f();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Catch in g()");
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		g();
	}

}
