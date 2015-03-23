package lezione12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class Freq { 
	private static final Integer ONE = new Integer(1); 
	
	//1 1 2 tre tre prova 3 prova prova
	public static void main(String args[]) { 
		Map m = new HashMap(); 
		Map m3 = new HashMap(); 
		// Initialize frequency table from command line 
		for (int i=0; i<args.length; i++) { 
			Integer freq = (Integer) m.get(args[i]);
			//System.out.println("(" + i + ") " + args[i] + ":" + (freq==null ? ONE : new Integer(freq.intValue() + 1)) ); 
			m.put(args[i],  (freq==null ? ONE : new Integer(freq.intValue() + 1))); 
			m3.put(args[i],  (freq==null ? ONE : new Integer(freq.intValue() + 1))); 
		} 
		System.out.println(m.size()+" distinct words detected:"); 
		System.out.println(m); 
		System.out.println(m3);
		
		
		
		System.out.println("------------------------");
		System.out.println("keySet():");
		for (Iterator i=m.keySet().iterator(); i.hasNext(); ) {
		     System.out.println(i.next());}
	   
		System.out.println("------------------------");
		System.out.println("values():");
		for (Iterator i=(m.values()).iterator(); i.hasNext(); ) {
		     System.out.println(i.next());}
		
		System.out.println("------------------------");
		System.out.println("entrySet():");
		for (Iterator i=m.entrySet().iterator(); i.hasNext(); ) { 
			Map.Entry e = (Map.Entry) i.next(); 	
			System.out.println(e.getKey() + ": " + e.getValue()); 
		} 

		System.out.println("------------------------");
		System.out.println("sotto-mappa:");
		Map m2 = new HashMap(); 
		m2.put("2",1);
		m2.put("1",2);
		//m2.put("4", 5);

	 	
		//m2 sotto-mappa di m
		if (m.entrySet().containsAll(m2.entrySet())) { 
		    System.out.println("YES");
		} 
		
		System.out.println("m uguale ad m3: " + m.equals(m3));



	} 
}
