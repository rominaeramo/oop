package lezione13.xfiles;

// Cerca di ripristinare un file serializzato senza
// la classe dell'oggetto archiviato nel file.

//La classe ThawAlien deve trovarsi in una sottodirectory
//chiamata xfiles

import java.io.*;

import lezione13.Alien;

//Prova a cancellare Alien.class prima di eseguire
public class ThawAlien {
  public static void main(String[] args) throws Exception {
    ObjectInputStream in = new ObjectInputStream(
      new FileInputStream(new File("X.file")));
    Alien mystery = (Alien) in.readObject();
    System.out.println(mystery.getClass());
    mystery.method();
  }
}

//L'apertura del dile e la lettura di mistery richiedono l'oggetto
// Class di Alien, la JVM non lo trova (per trovarlo dovrebbe essere
// nel CLASSPATH
