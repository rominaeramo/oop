package lezione11;

public class TestStackOverflow {
    static int numeroChiamata;

    public static void main(String[] args) {
    	//int i=0;
    	try {
    		funzioneRicorsiva();
    	} catch (StackOverflowError e) {
    		System.out.println("sono in StackOverflowError");
    	}
    	
    	System.out.println("Sono dopo try");   
    }
    
    public static void funzioneRicorsiva() throws StackOverflowError {
         System.out.println("Invocazione metodo numero: " + numeroChiamata++);    
        	 funzioneRicorsiva();
    }
}
