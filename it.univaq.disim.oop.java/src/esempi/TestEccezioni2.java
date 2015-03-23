/**
 * 
 */
package esempi;

public class TestEccezioni2 {

	public static void main(String args[]) { 
		int i=1, j=1;
		String s=null; 
		try { 
			i++; 
			j--; 
			char a=s.charAt(0); 
			if(i/j > 1) 
				i++; 
		} 

		catch(ArithmeticException e) { 
			System.out.println(0); 
		} 

		catch(ArrayIndexOutOfBoundsException e) { 
			System.out.println(1); 
		} 

		catch(Exception e) { 
			System.out.println(2); 
		} 

		finally { 
			System.out.println(3); 
		} 

		System.out.println(4); 

	} 

}


//2 3 4 