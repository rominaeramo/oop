package lezione10;


interface Monster {
  void menace();
}

interface DangerousMonster extends Monster {
  void destroy();
}

interface Lethal {
  void kill();
}

class DragonZilla implements DangerousMonster {
  public void menace() {
	  System.out.println("menace() DragonZilla");
  }
  public void destroy() {
	  System.out.println("destroy() DragonZilla");
  }
}

interface Vampire extends DangerousMonster, Lethal {
  void drinkBlood();
}

class VeryBadVampire implements Vampire {
  public void menace() {
	  System.out.println("menace() VeryBadVampire");
  }
  public void destroy() {
	  System.out.println("destroy() VeryBadVampire");
  }
  public void kill() {
	  System.out.println("kill() VeryBadVampire");
  }
  public void drinkBlood() {
	  System.out.println("drinkBlood() VeryBadVampire");
  }
}

public class HorrorShow {
  static void u(Monster b) { b.menace(); }
  static void v(DangerousMonster d) {
    d.menace();
    d.destroy();
  }
  static void w(Lethal l) { l.kill(); }
  public static void main(String[] args) {
    DangerousMonster barney = new DragonZilla();
    u(barney);
    v(barney);
    //w(barney);
    Vampire vlad = new VeryBadVampire();
    u(vlad);
    v(vlad);
    w(vlad);
  }
}
