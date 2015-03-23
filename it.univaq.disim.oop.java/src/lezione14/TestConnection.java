package lezione14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";

    public static void main( String[] args ) {
        try {
            Class.forName( DRIVER_NAME );
            Connection connection = DriverManager.getConnection( args[ 0 ], args[ 1 ], args[ 2 ] );
        }
        catch ( ClassNotFoundException e ) {
            e.printStackTrace();
        }
        catch ( SQLException e ) {
            e.printStackTrace();
       }
    }
}

//C:> java TestConnection jdbc:mysql://localhost/javalibrary root ""
 

