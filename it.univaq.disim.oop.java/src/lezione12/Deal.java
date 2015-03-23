package lezione12;

import java.util.*; 

public class Deal { 
	
	public static List dealHand(List deck, int n) {
        int deckSize = deck.size();
        
        //System.out.println("Size di list: " + deckSize);   
        //System.out.println("Value of n: " + n);
        
        List handView = deck.subList(deckSize-n, deckSize);
        
        List hand = new ArrayList(handView);
        handView.clear();
        return hand;
    }

	
	public static void main(String args[]) { 
		
		int numHands = Integer.parseInt(args[0]); 
		
		// Make a normal 52-card deck 		
		int cardsPerHand = Integer.parseInt(args[1]); 
		
		String[] suit = new String[] {"spades", "hearts", "diamonds", "clubs"}; 
		
		String[] rank = new String[] {"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"}; 
		
		List deck = new ArrayList(); 
		
		for (int i=0; i<suit.length; i++) 
			for (int j=0; j<rank.length; j++) 
				deck.add(rank[j] + " of " + suit[i]);

		Collections.shuffle(deck); 
		
		for (int i=0; i<numHands; i++) 
			System.out.println(dealHand(deck, cardsPerHand)); 
	} 

}
