package lezione13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Echo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		String aux;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		 
		//(1)
	//	while ( (aux = br.readLine()) != null){						
	//		System.out.println(aux);
	//	}
		
		
		//(2)
		
	 	OutputStreamWriter osw = new OutputStreamWriter(System.out); //(1)
		BufferedWriter bw = new BufferedWriter(osw);					
		while ( (aux = br.readLine()) != null){						
			osw.write(aux);												
			osw.flush();	
		}															
		
		
		
		
		/*
		//(3)
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		PrintWriter pw = new PrintWriter(osw);
		
		while ( (aux = br.readLine()) != null){						
			 pw.print(aux);	
			 pw.flush();
		}
		*/
 
		
		
	}

}
