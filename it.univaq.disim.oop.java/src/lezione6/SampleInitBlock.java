package lezione6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


class A1 {
        
        int x = 200;
        static int y;
        //A1 a1 = new A1();  // Questo da errore a run-time. Vedere Self.java
        
        {                   // Blocco di inizializzatore di istanza
                Integer num = null;
                System.out.println("Valore di x nel blocco di inizializzazione "+x);
                try {
                        num = read("src/lezione5/xValue.txt");
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
                x=num.intValue();
                
        }
        
        static {        // Il blocco di inizializzatore statico viene eseguito prima di quello di istanza
                y=10;
                System.out.println("Valore di y " + y);
        }
        
        
        A1(){
                System.out.println("Sono nel costruttore: Valore di x prima "+x);       
                x=400;
                System.out.println("Sono nel costruttore: Valore di x dopo "+x);        
        }
        
        public static Integer read(String fileName) throws IOException {
            BufferedReader in =
              new BufferedReader(new FileReader(fileName));
            String s;
            Integer num=null;
            if ((s = in.readLine()) != null) {
              num = new Integer(s);
                }
            in.close();
            return num;
}
        
}


public class SampleInitBlock {

        /**
         * @param args
         */
	
        public static void main(String[] args) {
                A1 a1 = new A1();                          
        }

}