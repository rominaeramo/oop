package lezione3;

 
class Letter {
  char c;
}

//Aliasing durante le chiamate di metodo
 
public class PassObject {
 
  public static void f(Letter y) {
    y.c = 'z';
  }
  
  public static void g(char y) {
	    y = 't';
  }
  
  public static void main(String[] args) {
    Letter x = new Letter();
    x.c = 'a';
    System.out.println("1: x.c: " + x.c);
    f(x);
    System.out.println("2: x.c: " + x.c);
    g(x.c);
    System.out.println("3: x.c: " + x.c);
     
  }
}  
