package lezione3;

public class LocalVariable {
 
	
	//public static int k;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=3;
		int k;
		/* ESEMPIO 1 
		while (true) {
			k = n;
			if (k >= 5) break;  //OK
			n = 6;
		}
		System.out.println(k);
		*/
		/* ESEMPIO 2 */
	
		while (n < 4) {
		 
			k = n;
			if (k >= 5) break;
			n = 6;
		}
		//System.out.println(k); //NOT OK
		
		
		/* ESEMPIO 3
		if (n>2)
			k=3;
		System.out.println(k);
		*/
		
		
		 
		 
		 
		

		
	}

}
