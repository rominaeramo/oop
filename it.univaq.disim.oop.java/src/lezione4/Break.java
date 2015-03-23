package lezione4;

public class Break {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int res = 0; 
		for (int i = 0,j = 10; i<j; i++,j--) {
				if (res >= 30) {
					System.out.println("Valore di i " + i);
					System.out.println("Valore di j " + j);
					break;
				} 
				res += i+j; 
		} 
		
		System.out.println(res);

	}

}
