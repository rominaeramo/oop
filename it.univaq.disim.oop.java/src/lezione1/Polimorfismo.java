/**
 * 
 */
package lezione1;

/**
 * @author romina
 * @see http://www.di.univaq.it/romina.eramo/tlp
 *
 */
public class Polimorfismo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		Shape s = null; 
		
		if (x > 3) {
			s = new Circle();
		} else {
			s = new Triangle();
		}
		s.draw();
		
		//Errore in run-time
		//((Circle) s).draw();
		
		//Errore in compile-time
		//s.draw2();
		
	}

}
