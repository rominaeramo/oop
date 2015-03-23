package lezione3;

public class VarInit {

	int k;
	 
	public static void main (String args[]){
		int k;
		int n=9;
		
		while (n < 4) {
			k = n;
			if (k >= 5) break;
				n = 6;
			}
		//System.out.println(k); //NOT OK
	}

}