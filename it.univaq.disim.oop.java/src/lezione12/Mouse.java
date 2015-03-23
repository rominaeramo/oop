package lezione12;


public class Mouse {
  private int mouseNumber;
  public Mouse(int i) { mouseNumber = i; }
  // Override Object.toString():
  public String toString() {
    return "This is Mouse #" + mouseNumber;
  }
  public int getNumber() { return mouseNumber; }
} ///:~
