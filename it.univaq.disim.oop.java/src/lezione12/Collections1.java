package lezione12;

import java.util.*;

public class Collections1 {

    public static void main( String[] args ) {
        Collection c = new ArrayList();
        c.add( "ten" );
        c.add( "ten" );
        c.add( "eleven" );
        System.out.println( c );

        
        Object[] array = c.toArray();
        for ( int i = 0; i < array.length; i++ ) {
            String element = ( String ) array[ i ];
            System.out.println( "Elemento di array:" + element );
        }
       
        //String[] array1 = ( String[] ) c.toArray();  //ClassCastException
        String[] str = ( String[] ) c.toArray( new String[ 10 ] );
        System.out.println("Dimensione di str " + str.length);
        for ( int i = 0; i < str.length; i++ ) {
             String element = str[ i ];
             System.out.println( "Elemento di str: " + element );
        }
        
    }
}
