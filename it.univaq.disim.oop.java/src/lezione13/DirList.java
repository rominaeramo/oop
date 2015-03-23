//Visualizza l'elenco del contenuto di una directory usando le espressioni regolari

package lezione13;
 
import java.io.*;
import java.util.*;
import java.util.regex.*;
 
															//DA NOTARE:
public class DirList {										
  public static void main(String[] args) {
    File path = new File(".");								//- Classe File
    String[] list;
    if(args.length == 0)
    	  // list() restituisce un array di String che rappresenta il contenuto dell'oggetto File,
    	  // cioè i nomi di un insiem di file presenti in una directory
      list = path.list(); 
    else
      list = path.list(new DirFilter(args[0]));
    Arrays.sort(list, new AlphabeticComparator());			//- Comparator: visto nella lezione precedente
    for(int i = 0; i < list.length; i++)
      System.out.println(list[i]);
  }
}

class DirFilter implements FilenameFilter {					
  private Pattern pattern;
  public DirFilter(String regex) {
    pattern = Pattern.compile(regex);						//- Uso delle espressioni regolari
  }
  public boolean accept(File dir, String name) {
    // Strip path information, search for regex:
    return pattern.matcher(
      new File(name).getName()).matches();
  }
} ///:~
