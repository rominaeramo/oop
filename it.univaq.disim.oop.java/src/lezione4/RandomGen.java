package lezione4;
import java.util.*;

public class RandomGen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int threshold=0;
		int j = 0;
		
		Random generator = new Random(System.currentTimeMillis());
		threshold = generator.nextInt();
		
		for (int i=0;i<25;i++){
			j=generator.nextInt();
			if ( j < threshold) {
				System.out.println("Numero " + j + " < della soglia " + threshold);
			} else if ( j > threshold) {
					System.out.println("Numero " + j + " > della soglia " + threshold);
					} else {
						System.out.println("Numero " + j + " = alla soglia " + threshold);
					}
		}
	}

}
