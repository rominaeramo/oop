package lezione13;

import java.io.*;

public class DataOutputStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException, FileNotFoundException{
 
		File outFile = new File("src/lezione13/test.out");
		FileOutputStream outFileStream;
 
		outFileStream = new FileOutputStream(outFile);
		PrintStream ps = new PrintStream(outFileStream);
		DataOutputStream dos = new DataOutputStream(outFileStream);
		
		Float f = new Float("3.14");
		
		ps.print(f);
		//dos.writeFloat(f);
			

	}

}
