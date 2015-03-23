package lezione11;



class MyException30 extends Exception {}
class MyException31 extends Exception {}		//(1)
//class MyException31 extends MyException30 {}	//(2)
class MyException32 extends Exception {}
class MyException33 extends Exception {}



interface MyInterface {
	public void m1() throws MyException31;
}

class Base {
	public Base() throws MyException32  {}	
	
	public void m1() throws MyException30 {}
}


class Derived extends Base  { //implements MyInterface{
	
	public Derived() throws MyException32 {}				
	
	//public Derived() throws MyException32, MyException33 {}	//E' consentito aggiungere nuove eccezioni per i costruttori
																//ma e' obbligatorio tener conto delle eccezioni dei costruttori
																//della classe base.
	
	public void m1()  {}
	
	//public void m1() throws MyException31  {					// Provare ad usare "class Derived extends Base implements MyInterface"
	//	throw new MyException31();
	//}

	//! public void m1() throws Exception {}
	
	//! public void m1() throws MyException31 {				//Se si usa (1) invece che (2) si ha un errore
	//		throw new MyException31();
	//}
	//  public void m1() throws MyException30, MyException31 {} //Se si usa (1) invece che (2) si ha un errore
}


public class ExceptionsInHierarchy {


	public static void main(String args[]) throws MyException32 {
		
		Base b1 = new Base();
		Derived d1 = new Derived();
		
		try {
			b1.m1();
		} catch (MyException30 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d1.m1();
		
	}
	

}
