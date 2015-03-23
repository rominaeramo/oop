/**
 * 
 */
package lezione2;

/**
 * @author romina
 * @see http://www.di.univaq.it/romina.eramo/tlp
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		
		System.out.println( "st1.x = " + st1.i);
		System.out.println( "st2.x = " + st2.i);
		
		st1.i++;
		
		System.out.println( "st1.x = " + st1.i);
		System.out.println( "st2.x = " + st2.i);
		
		StaticTest.i++;
		
		System.out.println( "st1.x = " + st1.i);
		System.out.println( "st2.x = " + st2.i);
		
		st1.stampa(3, 4);
		
		StaticTest.stampa(3, 4);

	
	}

}
