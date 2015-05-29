package lezione12;



import java.util.*;

public class CatsAndDogsWithGenerics {
  public static void main(String[] args) {
    List<Cat> cats = new ArrayList<Cat>();
    for(int i = 0; i < 7; i++)
      cats.add(new Cat(i));
    
    cats.add(new Cat(7));
    //cats.add(new Dog(10));
    
    
    for(int i = 0; i < cats.size(); i++)
    	(cats.get(i)).id();
    
  }
} 
