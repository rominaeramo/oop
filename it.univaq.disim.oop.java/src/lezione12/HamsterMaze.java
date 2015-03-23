package lezione12;

import java.util.*;

public class HamsterMaze {

	public static void main(String[] args) {
	    List list = new ArrayList();
	    List cats = new ArrayList();
	    
	    for(int i = 0; i < 3; i++)
	    		list.add(new Hamster(i));
	    for(int i= 0; i<3; i++)
	    		cats.add(new Cat(i));
	    
	    Printer.printAll(list.iterator()); 
	    Printer.printAll(cats.iterator());
	    //Printer.printAll(list);
	    //Printer.printAll(cats);
	    
	}
} ///:~
