package lezione13;

// Crea un file di output serializzato
// Il file che crea e serializza un oggetto Alien va posto nella stessa directory

import java.io.*;

public class FreezeAlien {
  // Throw exceptions to console:
  public static void main(String[] args) throws Exception {
    ObjectOutput out = new ObjectOutputStream(
      new FileOutputStream("X.file"));
    Alien zorcon = new Alien();
    out.writeObject(zorcon);
  }
} 

//Il programma produce un file X.file nella directory corrente 
