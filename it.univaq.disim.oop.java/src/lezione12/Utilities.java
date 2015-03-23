package lezione12;

 
 
import java.util.*;
 

public class Utilities {
 
  public static void main(String[] args) {
    List list = Arrays.asList(
     "one Two three Four five six one Four five six one".split(" "));
    //"one two three four five six one".split(" "));
     
  
    
    System.out.println(list);
    
    System.out.println("max: " + Collections.max(list));
    System.out.println("min: " + Collections.min(list));
    
    AlphabeticComparator comp = new AlphabeticComparator();
    
    System.out.println("max w/ comparator: " +
      Collections.max(list, comp));
    
    System.out.println("min w/ comparator: " +
      Collections.min(list, comp));
    
    List sublist =
      Arrays.asList("Four five six one".split(" "));
    
    System.out.println("indexOfSubList: " +
      Collections.indexOfSubList(list, sublist));
    
    System.out.println("lastIndexOfSubList: " +
      Collections.lastIndexOfSubList(list, sublist));
    
    Collections.replaceAll(list, "one", "Yo");
    System.out.println("replaceAll: " + list);
  
    Collections.reverse(list);
    System.out.println("reverse: " + list);
    Collections.rotate(list, 3);
    
    System.out.println("rotate: " + list);
    
    List source =
      Arrays.asList("in the matrix".split(" "));
    Collections.copy(list, source);
    System.out.println("copy: " + list);
    //Collections.swap(list, 0, list.size() - 1);
    Collections.swap(list, 0, 5);
    System.out.println("swap: " + list);
    Collections.fill(list, "pop");
    System.out.println("fill: " + list);
    List dups = Collections.nCopies(3, "snap");
    System.out.println("dups: " + dups);
     
  }
} ///:~