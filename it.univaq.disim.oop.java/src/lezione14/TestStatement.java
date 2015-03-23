package lezione14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestStatement {
    private static final String DRIVER_NAME="com.mysql.jdbc.Driver";
    private static  String SQL = "SELECT * FROM title";

    public static void main( String[] args ) {
        try {
            Class.forName( DRIVER_NAME );

            Connection connection = DriverManager.getConnection( args[ 0 ], args[ 1 ], args[ 2 ] );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery( SQL );
            
            while ( resultSet.next() ) {
                System.out.println( "ID: " + resultSet.getInt( "title_id" ) );
                System.out.println( "Name: " + resultSet.getString( "name" ) );
                System.out.println( "Title Kind ID: " + resultSet.getInt( "title_kind_ID" ) );
                System.out.println( "Description: " + resultSet.getString( "description" ) );
                System.out.println( "Author: " + resultSet.getString( "author" ) );
                System.out.println( "Isbn: " + resultSet.getString( "isbn" ) );
                System.out.println( "-----------------------------------" );
              }
           
          String stringParam = new String("prova_descrizione2");
        
          /*
         SQL ="INSERT INTO javalibrary.title_kind " + 
             	   "VALUES (1 , 'kind_prova')";
           
          
             statement.executeUpdate(SQL);
         */
          
          SQL ="INSERT INTO javalibrary.title " + 
          	   "VALUES (NULL , 'titolo_prova', 1, '" + stringParam + "' , 'prova_autore2', 'prova_isbn2')";
        
       
          statement.executeUpdate(SQL);
           
          
        //   SQL = "DELETE FROM javalibrary.title WHERE name = 'titolo_prova'";
        //   statement.executeUpdate(SQL);
           
           
         //  SQL = "UPDATE javalibrary.title SET name =  'newName' WHERE name = 'name2'";
         //  statement.executeUpdate(SQL);
           
         //  statement.executeUpdate(SQL);
        
        }
            catch ( ClassNotFoundException e ) {
                 e.printStackTrace();
            }
            catch ( SQLException e ) {
                 e.printStackTrace();
            }
          }
        }


