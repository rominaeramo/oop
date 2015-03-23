package gui;
//: gui/SubmitLabelManipulationTask.java
// Il main dovrebbe sottoporre i task da eseguire al thread
// di invio degli eventi di Swing, e non intervenire direttamente
// sui conponenti dell'interfacca grafica

import javax.swing.*;
import java.util.concurrent.*;

public class SubmitLabelManipulationTask {
  public static void main(String[] args) throws Exception {
    JFrame frame = new JFrame("Hello Swing");
    final JLabel label = new JLabel("A Label");
    frame.add(label);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 100);
    frame.setVisible(true);
    TimeUnit.SECONDS.sleep(1);
    // Il task viene inserito nella coda di eventi e verra poi avviato
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        label.setText("Hey! This is Different!");
      }
    });
  }
} ///:~
