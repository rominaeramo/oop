package lezione12;

import java.util.*;

public class Printer {
	static void printAll(Iterator e) {
    while(e.hasNext())
      System.out.println(e.next());
	}
	
	static void printAll(Collection c) {
			Iterator e = c.iterator();
		    while(e.hasNext())
		      System.out.println(e.next());
		    /*e = c.iterator();
		    while(e.hasNext())
			      System.out.println(e.next());*/
	}
} 