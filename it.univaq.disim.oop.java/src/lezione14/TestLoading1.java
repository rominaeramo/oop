package lezione14;

public class TestLoading1 {

    public static void main( String[] args ) {
        try {
            Class.forName("com.mysql.jdbc.Driver" );
        }
        catch ( ClassNotFoundException e ) {
            e.printStackTrace();
        }
    }
}
