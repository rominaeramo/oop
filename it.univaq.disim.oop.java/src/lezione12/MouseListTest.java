package lezione12;

import java.util.ArrayList;
import java.util.List;



public class MouseListTest {
  public static void main(String[] args) {
    //List mouses = new ArrayList();
    //mouses.add(new Mouse(5));
    //mouses.add(new Cat(7));
    
    MouseList mice = new MouseList();
    for(int i = 0; i < 3; i++)
    	//!mice.add(new Cat(5));
    	mice.add(new Mouse(i));
    for(int i = 0; i < mice.size(); i++)
      MouseTrap.caughtYa(mice.get(i));
  }
} ///:~
