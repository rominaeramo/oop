package lezione14;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TestLoading3 {

    public static void main( String[] args ) {
        try {
			Driver driver = new com.mysql.jdbc.NonRegisteringDriver();
			DriverManager.registerDriver( driver );
        }
        catch ( SQLException e ) {
            e.printStackTrace();
        }
    }

}

