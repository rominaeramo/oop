package lezione10;

 
interface CanFight {
  void fight();
}

interface CanSwim {
  void swim();
}

interface CanFly {
  void fly();
}

class ActionCharacter {
  public void fight() {
	  System.out.println("fight() in ActionCharacter");
	  
  }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
  public void swim() {
	  System.out.println("swim() in Hero");
	  
  }
  public void fly() {
	  System.out.println("fly() in Hero");
	  
  }
 
}

public class Adventure {
  
	public static void t(CanFight x) { x.fight(); }
	public static void u(CanSwim x) { x.swim(); }
	public static void v(CanFly x) { x.fly(); }
	public static void w(ActionCharacter x) { x.fight(); }
	public static void main(String[] args) {
    
	  
	Hero h = new Hero();
	t(h); // Treat it as a CanFight
	u(h); // Treat it as a CanSwim
	v(h); // Treat it as a CanFly
	w(h); // Treat it as an ActionCharacter
  }
} ///:~
