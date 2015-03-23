package lezione13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		int aux;
		
		BufferedReader bin = new BufferedReader(new FileReader("src/lezione13/Copy.java"));
		FileWriter fw = new FileWriter("src/lezione13/Copybackup.java");

		while ( (aux=bin.read()) != -1){
			fw.write(aux);
		}
		
		fw.flush();
		bin.close();
		fw.close();
		

	}

}
