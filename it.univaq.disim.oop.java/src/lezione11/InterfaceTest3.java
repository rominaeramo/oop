package lezione11;

import java.io.FileNotFoundException;
import java.io.IOException;


class AC30 {
	//public void event() throws IOException{
	public void event() throws FileNotFoundException{
		throw new FileNotFoundException();
	}
	
}

interface I30{
	//public void event() throws FileNotFoundException;
	public void event() throws IOException;
}

class C30 extends AC30 implements I30 {
	
}

public class InterfaceTest3  {

	public static void main(String[] args){
		C30 c = new C30();
	//	c.event();
	}
	
}
