package lezione14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestPreparedStatementClose {
    private static final String DRIVER_NAME="com.mysql.jdbc.Driver";
    private static final String SQL =  "SELECT * FROM title WHERE name=?";

    public static void main( String[] args ) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName( DRIVER_NAME );

            conn = DriverManager.getConnection(args[ 0 ], args[ 1 ], args[ 2 ] );
            ps = conn.prepareStatement( SQL );
            ps.setString( 1, "titolo_prova");
            rs = ps.executeQuery();
            
            while ( rs.next() ) {
                System.out.println( "ID: " + rs.getInt( "title_id" ) );
                System.out.println( "Name: " + rs.getString( "name" ) );
                System.out.println( "Title Kind ID: " + rs.getInt( "title_kind_ID" ) );
                System.out.println( "Description: " + rs.getString( "description" ) );
                System.out.println( "Author: " + rs.getString( "author" ) );
                System.out.println( "Isbn: " + rs.getString( "isbn" ) );
                System.out.println( "-----------------------------------" );
            }
                
          }
          catch ( ClassNotFoundException e ) {
              e.printStackTrace();
          }
          catch ( SQLException e ) {
              e.printStackTrace();
          }
          
          finally {
              if (rs!=null) {
                  try {
                     rs.close();
                  } catch (SQLException e) {/*Do Nothing*/}
              }
              if (ps!=null) {
                  try {
                     ps.close();
                  } catch (SQLException e) {/*Do Nothing*/}
              }
              if (conn!=null) {
                  try {
                     conn.close();
                  } catch (SQLException e) {/*Do Nothing*/}
              }
           }

         }
      }


