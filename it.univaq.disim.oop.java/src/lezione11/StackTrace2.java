package lezione11;

class StackTrace2{
    public static void main( String[] args ) {
        crunch( null );
    }

    static void crunch( int[] a ) {
        try {
            mash( a );
        }
        catch ( MyException3 e ) {
            e.printStackTrace();
            System.err.println("---------------------");
            e.getCause().printStackTrace();
            System.err.println("---------------------");
        }
    }
    static void mash( int[] b ) {
        try {
            System.out.println( b[ 0 ] );
        }
        catch ( Exception e ) {
            throw new MyException3( "Errore", e );
        	//throw new MyException3( "Errore");
        }
    }
}

