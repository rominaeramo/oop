package lezione13;

import java.io.*;

public class CpFile {

	public static void  main(String[] args) throws FileNotFoundException {
	
		int aux;
		
		if (args.length !=2){
			System.err.println("Usage: CpFile <inFile> <outFile>\n");
			System.exit(1);
		}		
		File inFile = new File(args[0]);
		File outFile = new File(args[1]);
		if (! inFile.exists()) {
			throw new FileNotFoundException("Il file "+args[0]+" e' inesistente");
		}
		if (! outFile.exists()) {
			throw new FileNotFoundException("Il file "+args[1]+" e' inesistente");
		}
		FileInputStream inFileStream = new FileInputStream(inFile);
		FileOutputStream outFileStream = new FileOutputStream(outFile);
		try {
			while ((aux=inFileStream.read()) != -1){
				outFileStream.write(aux);
			}
			inFileStream.close();
			outFileStream.close();
			System.out.println("Il file "+args[0]+" e' stato correttamente copiato in "+args[1]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}

}
