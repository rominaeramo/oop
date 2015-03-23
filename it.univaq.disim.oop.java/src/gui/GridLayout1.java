package gui;
//: gui/GridLayout1.java
// Demonstrates GridLayout.
// Costruisce una griglia in cui disporre i
// componenti da sinistra a destra e dall'alto
// verso il basso
import javax.swing.*;
import java.awt.*;
import static net.mindview.util.SwingConsole.*;

public class GridLayout1 extends JFrame {
  public GridLayout1() {
    setLayout(new GridLayout(7,3)); //nel costruttore sono specificate num. righe e colonne
    for(int i = 0; i < 20; i++)
      add(new JButton("Button " + i));
  }
  public static void main(String[] args) {  
    run(new GridLayout1(), 300, 300); 
  }
} ///:~
