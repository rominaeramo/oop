package lezione4;
import java.util.*;

public class ArrayOfArraysDemo2 {

	/**
	 * @param args
	 */
	static Random rand = new Random();
	
	public static void main(String[] args) {

		int[][][] a3 = new int[rand.nextInt(7)][][];

		for (int i = 0; i< a3.length; i++){
			a3[i] = new int[rand.nextInt(5)][];
			for (int j=0; j < a3[i].length; j++)
				a3[i][j] = new int[rand.nextInt(5)];
		}
	

	}

}
