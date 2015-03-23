package lezione16;

public final class Singleton {

    private static Singleton instance = new Singleton( 10 );

    private int singletonData;
    private Singleton( int data ) {
        singletonData = data;
    }

    public void singletonOperation() {
        singletonData += 10;
    }

    public int getSingletonData() {
        return singletonData;
    }

    public static final Singleton getInstance() {
        return instance;
    }  
}
