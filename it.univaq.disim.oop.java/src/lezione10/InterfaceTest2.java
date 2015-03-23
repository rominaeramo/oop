package lezione10;


interface Cutable {
	void cut();
}

// equivalente a 
//
//abstract class Cutable2 {	
//	abstract public void cut2();
//}

abstract class Cutable2 {	
	 public void cut2(){};
}



class C20 implements Cutable{
	// void cut(){}	//ERRORE
	public void cut(){}
}


class C21 extends Cutable2{	
}


public class InterfaceTest2 {
}
