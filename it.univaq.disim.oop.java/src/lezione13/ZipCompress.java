package lezione13;


 
import java.io.*;
import java.util.*;
import java.util.zip.*;

public class ZipCompress {
 
  // Throw exceptions to console:
  public static void main(String[] args) throws IOException {

	FileOutputStream f = new FileOutputStream("test.zip");
    CheckedOutputStream csum =
      new CheckedOutputStream(f, new Adler32());
    
    ZipOutputStream zos = new ZipOutputStream(csum);
    BufferedOutputStream out =
      new BufferedOutputStream(zos);
    
    zos.setComment("A test of Java Zipping");
    
    // No corresponding getComment(), though.
    for(int i = 0; i < args.length; i++) {
      System.out.println("Writing file " + args[i]);
      BufferedReader in =
        new BufferedReader(new FileReader(args[i]));
      zos.putNextEntry(new ZipEntry(args[i]));
      int c;
      while((c = in.read()) != -1)
        out.write(c);
      in.close();
    }
    out.close();
    
    // Checksum valid only after the file has been closed!
    System.out.println("Checksum: " +
      csum.getChecksum().getValue());
    // Now extract the files:
    System.out.println("Reading file test.zip");
    FileInputStream fi = new FileInputStream("test.zip");
    CheckedInputStream csumi =
      new CheckedInputStream(fi, new Adler32());
    ZipInputStream in2 = new ZipInputStream(csumi);
    BufferedInputStream bis = new BufferedInputStream(in2);
    ZipEntry ze;
    while((ze = in2.getNextEntry()) != null) {
      System.out.println("--> Reading file " + ze);
      int x;
      while((x = bis.read()) != -1)
        System.out.write(x);
    }
     
       
    System.out.println("\nChecksum: " +
      csumi.getChecksum().getValue());
    bis.close();
    // Alternative way to open and read zip files:
    ZipFile zf = new ZipFile("test.zip");
    Enumeration e = zf.entries();
    while(e.hasMoreElements()) {
      ZipEntry ze2 = (ZipEntry)e.nextElement();
      System.out.println("File: " + ze2);
      // ... and extract the data as before
    }
    
  }
} ///:~