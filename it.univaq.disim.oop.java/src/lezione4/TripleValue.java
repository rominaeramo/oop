package lezione4;

public class TripleValue {
	
	public static void tripleValue(double x) {
		
		x = 3 * x;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double percent = 10;
		tripleValue(percent);
		System.out.println(percent);

	}

}
