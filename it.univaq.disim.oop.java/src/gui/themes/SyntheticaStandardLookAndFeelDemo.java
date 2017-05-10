package gui.themes;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.UIManager;

import de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel;
 
public class SyntheticaStandardLookAndFeelDemo {
  public static void main(String[] args) {
   
	  try 
	    {
	      UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
	    } 
	    catch (Exception e) 
	    {
	      e.printStackTrace();
	    }
  
  JLabel label = new JLabel("Label");
  JTextField field = new JTextField("www.forgetcode.com!");
  JList list = new JList(new String[] { "A", "B", "C" });
  JScrollPane listPane = new JScrollPane(list);
  listPane.setPreferredSize(new Dimension(220, 100));

  JScrollPane treePane = new JScrollPane(new JTree());
  treePane.setPreferredSize(new Dimension(220, 100));
  JButton button = new JButton("Click me");

  JPanel cp = new JPanel();
  cp.add(label);
  cp.add(field);
  cp.add(listPane);
  cp.add(treePane);
  cp.add(button);

  JFrame frame = new JFrame();
  frame.setTitle("Windows Look and Feel Demo");
  frame.setPreferredSize(new Dimension(280, 300));
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setContentPane(cp);
  frame.pack();
  frame.setVisible(true);
  }
}

