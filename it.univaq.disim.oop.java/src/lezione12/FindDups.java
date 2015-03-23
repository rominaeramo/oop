package lezione12;

import java.util.*; 

public class FindDups {
	
	//1 5 1 2 3 2 7 8 5 9 7
	public static void main(String args[]) {
		//Set s = new HashSet();
		Set s = new LinkedHashSet();
		
		for (int i=0; i<args.length; i++) 			
			if (!s.add(args[i]))
				System.out.println("Duplicate detected: "+args[i]);
		System.out.println(s.size()+" distinct words detected: "+s); 
		
		Set orderedS = new TreeSet(s);
		System.out.println(orderedS); 
		
		System.out.println("s contains 7 "+ s.contains("7"));
		s.remove("7");
		System.out.println("s contains 7 "+ s.contains("7"));

	} 
}
