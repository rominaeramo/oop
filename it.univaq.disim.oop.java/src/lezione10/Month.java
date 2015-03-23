package lezione10;


public class Month {
    private int month;
    private String name;

    public Month(int month, String name ) {
       this.month = month;
       this.name = name;
    }

    public int getMonth() {
       return month;
    }
    
    public String getName() {
       return name;
    }
    
    public static void main(String args[]){
    	Month x = Months.JANUARY;
    	
    	System.out.println(x.getName() + ": " + x.getMonth());
    	
    }
}
