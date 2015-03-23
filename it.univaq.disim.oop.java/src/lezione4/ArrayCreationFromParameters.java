package lezione4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayCreationFromParameters {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		Integer  dim = Integer.parseInt(args[0]);
		Integer[] anArray;
		anArray = new Integer[dim];
		
		for (int i=0; i< dim; i++){
			System.out.println("Inserisci l'elemento " + i);
			anArray[i] = new Integer(br.readLine());	
		}
		
		for (int j = 0; j < anArray.length; j++) {
			System.out.println("anArray[" + j + "] ... " + anArray[j]);
		}
		
	}

}
