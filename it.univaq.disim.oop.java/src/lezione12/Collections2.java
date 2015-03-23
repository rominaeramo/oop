package lezione12;

import java.util.*;

public class Collections2 {
    public static void main( String[] args ) {
        Collection c = new ArrayList();
        c.add( "ten" );
        c.add( "eleven" );

        System.out.println( "Numero Elementi: " + c.size() );
        for ( Iterator i = c.iterator(); i.hasNext(); ) {
            String element = ( String ) i.next();
            System.out.println( "Elemento i-esimo:" + element );
            if ( element.equals( "eleven" ) ) {
                i.remove();
            }
        }
        System.out.println( "Numero Elementi: " + c.size() );
    }
}
