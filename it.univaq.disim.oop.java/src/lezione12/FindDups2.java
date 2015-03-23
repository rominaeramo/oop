package lezione12;

import java.util.*; 
public class FindDups2 { 
	
	//1 5 1 2 3 2 7 8 5 9 7
	public static void main(String args[]) {
		Set uniques = new HashSet(); 
		Set dups = new HashSet(); 
		for (int i=0; i<args.length; i++) 
			if (!uniques.add(args[i])) 
		                    dups.add(args[i]); 
		
		Iterator it = uniques.iterator();
		System.out.println("Stampa del Set uniques");
		while (it.hasNext()) {
			System.out.print(" " + it.next());
		}
		System.out.println("");
		it = dups.iterator();
		System.out.println("Stampa del Set dips");
		while (it.hasNext()) {
			System.out.print(" " + it.next());
		}
		System.out.println("");
		
		uniques.removeAll(dups); 
		
		// Destructive set-difference 
		System.out.println("Unique words: " + uniques); 
		System.out.println("Duplicate words: " + dups); 
   } 
}
