/**
 * 
 */
package esempi;

import java.util.Iterator;

/**
 * @author romina
 * @see http://www.di.univaq.it/romina.eramo/tlp
 *
 */
public class RefA<T> {
	private RefB myb = new RefB(null);
    private int f(T x) {
           // Iterator<?> i = myb.new MyIterator();
            String msg = RefB.f(x);
            double d = myb.g();
            return myb.g();
   }

	
}

class RefB<T> {

	RefB (){};
	RefB (String s) {};
	
	public int g(){ return 3;}
	//public int g(){return 3;}
	public static String f(Object x) { return new String("ok"); }
}

/*class RefB<T> {

	public static int x;
	public static String y;
	
	public RefB(Object object) {
		// TODO Auto-generated constructor stub
	}
	
	class Iterator<E>{
		// TODO Auto-generated method stub
		
	}
	public int g(){ return this.x;}
	public static String f(Object x) { return y; }
}	*/
