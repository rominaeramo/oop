package lezione12;


import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main( String[] args ) {
        Map map = new HashMap();
        map.put( "key1", "value1" );
        map.put( "key2", "value2" );
        map.put( "key3", "value1" );
        Object value = map.get( "key1" );
        System.out.println( "Valore: " + value );
        System.out.println( "Valore: " + map.get( "key" ) );
        System.out.println( "Valore: " + map.get( "key2" ) );
    }
}
