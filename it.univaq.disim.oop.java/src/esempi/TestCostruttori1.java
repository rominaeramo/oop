/**
 * 
 */
package esempi;

/**
 * @author romina
 * @see http://www.di.univaq.it/romina.eramo/tlp
 *
 */


class CostrB { 
	private int z; 
	
	public CostrB(int m){ 
		z=2*m; 
	} 

	public CostrB(float m){ 
		z=3*(int) m; 
	} 

	public int getZ() {return z;} 

} 

class CostrA extends CostrB { 

	private int x; 
	private int y;

	public CostrA(int i,int j){ 
		super((float)i/4); 
		x=i; 
		y=j; 
	} 

	public CostrA(int i){ 
		this(i,10); 
	} 

	public void print(){ 
		System.out.println(x+y+getZ()); 
	} 

} 

public class TestCostruttori1 {

	public static void main(String args[]){ 
		CostrA a=new CostrA(5); 
		a.print(); 
	} 

}
